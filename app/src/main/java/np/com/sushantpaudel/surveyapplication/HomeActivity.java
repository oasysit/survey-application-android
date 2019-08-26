package np.com.sushantpaudel.surveyapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;
import java.util.ArrayList;

import np.com.sushantpaudel.surveyapplication.active_android.DataModel;
import np.com.sushantpaudel.surveyapplication.new_data_entry.DataEntryActivity;
import np.com.sushantpaudel.surveyapplication.util.MyRuntimePermissions;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static np.com.sushantpaudel.surveyapplication.LoginActivity.mAuth;
import static np.com.sushantpaudel.surveyapplication.active_android.DataModel.getAllData;
import static np.com.sushantpaudel.surveyapplication.util.UtilClass.checkInternetConnection;
import static np.com.sushantpaudel.surveyapplication.util.UtilClass.setLocale;
import static np.com.sushantpaudel.surveyapplication.util.UtilClass.showToast;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.BASE_URL;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.ROUTE_DATA;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.SHARED_PREFS;
import static np.com.sushantpaudel.surveyapplication.util.ValueClass.SYNCED_TO_CLOUD;

/**
 * Created by susha on 6/2/2018.
 */

public class HomeActivity extends AppCompatActivity {
    private final String TAG = "Home Activity";
    private Context context = this;
    private FirebaseUser user;
    private int CHECK_LOCATION = 1313;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLocale(context);
        setContentView(R.layout.activity_home);
        CardView btnNewEntry = findViewById(R.id.btnNewEntry);
        CardView btnSyncData = findViewById(R.id.btnSyncData);
        CardView btnStatus = findViewById(R.id.btnStatus);
        CardView btnSettings = findViewById(R.id.btnSettings);
        if (mAuth == null) {
            mAuth = FirebaseAuth.getInstance();
        }
        user = mAuth.getCurrentUser();
        btnNewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "New Entry");
                //TODO Check location is on or not?
                if (new MyRuntimePermissions(context).locationPermission(CHECK_LOCATION)) {
                    startActivity(new Intent(context, DataEntryActivity.class));
                }
            }
        });
        btnSyncData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "Sync Data --> " + user.getEmail());
                final ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Syncing...\n(Please do not exit)");
                progressDialog.setCancelable(false);
                progressDialog.show();
                final String[] message = {"Sync Completed!"};
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (!checkInternetConnection(context)) {
                            message[0] = "Check your Internet Connection";
                        }
                        syncData();
                        progressDialog.dismiss();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                showToast(context, message[0]);
                            }
                        });
                    }
                }).start();
            }
        });
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "Status");
                startActivity(new Intent(context, StatusActivity.class));
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e(TAG, "Settings");
                startActivity(new Intent(context, SettingsActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == CHECK_LOCATION && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startActivity(new Intent(context, DataEntryActivity.class));
        } else {
            showToast(context, "Permission Denied");
        }
    }

    private void syncData() {
        ArrayList<DataModel> list = (ArrayList<DataModel>) getAllData();
        sendDataToTheServer(list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_logout:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(context, LoginActivity.class));
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private void sendDataToTheServer(ArrayList<DataModel> list) {
        final String url = BASE_URL + ROUTE_DATA;
        for (DataModel dataModel : list) {
            String json = dataModel.json;
            System.out.println(json);
            OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
            Request request = new Request.Builder()
                    .url(url)
                    .addHeader("Content-Type", "application/json; charset=utf-8")
                    .post(body)
                    .build();

            Response response = null;
            try {
                response = client.newCall(request).execute();
                if (response.body() != null) {
                    String responseValue = response.body().string();
                    if (responseValue.equals("{\"success\":true,\"data\":{\"Done\":\"Done\"}}")) {
                        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                        SharedPreferences.Editor editor = preferences.edit();
                        int count = preferences.getInt(SYNCED_TO_CLOUD, 0) + 1;
                        editor.putInt(SYNCED_TO_CLOUD, count);
                        editor.apply();
                        System.out.println("Data is saved!");
                        dataModel.delete();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
