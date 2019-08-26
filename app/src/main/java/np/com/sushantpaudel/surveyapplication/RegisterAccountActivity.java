package np.com.sushantpaudel.surveyapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;

import java.util.ArrayList;

import np.com.sushantpaudel.surveyapplication.model.Place;
import np.com.sushantpaudel.surveyapplication.model.User;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static np.com.sushantpaudel.surveyapplication.LoginActivity.mAuth;
import static np.com.sushantpaudel.surveyapplication.util.UtilClass.checkInternetConnection;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.BASE_URL;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.ROUTE_PLACES;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.ROUTE_USER;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.WEB_API_URL;

public class RegisterAccountActivity extends AppCompatActivity {
    private Context context = this;
    private ProgressDialog progressDialog;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private Spinner spinnerPlaceNames;
    private EditText editTextPhoneNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Null pointer exception not handled.
        progressDialog = new ProgressDialog(context);
        loadPlaces();
        editTextEmail = findViewById(R.id.editTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        spinnerPlaceNames = findViewById(R.id.spinnerPlaceNames);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        Button btnRegister = findViewById(R.id.btnRegisterUser);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerAccount();
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    private void loadPlaces() {
        showProgressDialog("Loading...");
        if (checkInternetConnection(context)) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    OkHttpClient client = new OkHttpClient();
                    String url = WEB_API_URL + ROUTE_PLACES;
                    RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "");
                    Request request = new Request.Builder()
                            .url(url)
                            .addHeader("Content-Type", "application/json")
                            .post(body)
                            .build();
                    try {
                        Response response = client.newCall(request).execute();
                        System.err.println(response);
                        String data = response.body().string();
                        loadPlacesToSpinner(data);
                    } catch (Exception e) {
                        e.printStackTrace();
                        showToast("Please try again later!");
                        finish();
                    }
                }
            }).start();
        } else {
            showToast("Check your Internet connection");
            finish();
        }
    }

    private void loadPlacesToSpinner(final String data) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Place place = new Gson().fromJson(data, Place.class);
                ArrayList<Place.PlaceName> placeNames = place.getPlaceNames();
                ArrayList<String> places = new ArrayList<>();
                places.add("---None---");
                for (Place.PlaceName placeName : placeNames) {
                    places.add(placeName.getPlaceName());
                }
                ArrayAdapter<String> adapterSpinner = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, places);
                spinnerPlaceNames.setAdapter(adapterSpinner);
                progressDialog.dismiss();
            }
        });
    }

    private void registerAccount() {

        final String email = String.valueOf(editTextEmail.getText());
        final String password = String.valueOf(editTextPassword.getText());
        String firstName = String.valueOf(editTextFirstName.getText());
        String lastName = String.valueOf(editTextLastName.getText());
        String placeName = String.valueOf(spinnerPlaceNames.getSelectedItem().toString());
        String phoneNumber = String.valueOf(editTextPhoneNumber.getText());
        final User user = new User(email, password, firstName, lastName, placeName, phoneNumber);

        if (!email.equals("") && !password.equals("")) {
            if (checkInternetConnection(context)) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        registerToOwnServer(user);
                    }
                }).start();
                new AlertDialog.Builder(context)
                        .setTitle("Do you want to register this account?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                showProgressDialog("Authenticating...");
                                mAuth.createUserWithEmailAndPassword(email, password)
                                        .addOnCompleteListener((Activity) context, new OnCompleteListener<AuthResult>() {
                                            @Override
                                            public void onComplete(@NonNull Task<AuthResult> task) {
                                                if (task.isSuccessful()) {
                                                    showToast("Your account is registered!");
                                                    progressDialog.dismiss();
                                                } else {
                                                    showToast("Task is unsuccessful! Try again later!");
                                                }
                                                progressDialog.dismiss();
                                            }
                                        });
                                mAuth = FirebaseAuth.getInstance();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        })
                        .show();
            } else {
                showToast("Check your Internet connection");
            }
        } else {
            showToast("Enter valid email ID");
        }
    }

    private void registerToOwnServer(User user) {
        OkHttpClient client = new OkHttpClient();
        String url = BASE_URL + ROUTE_USER;
        String json = new Gson().toJson(user);
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.err.println("Response: " + response.body().string());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    private void showProgressDialog(String message) {
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setMessage(message);
        progressDialog.show();
    }


}
