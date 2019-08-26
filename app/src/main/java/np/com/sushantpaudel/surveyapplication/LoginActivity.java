package np.com.sushantpaudel.surveyapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import np.com.sushantpaudel.surveyapplication.util.UtilClass;

import static np.com.sushantpaudel.surveyapplication.util.UtilClass.checkInternetConnection;

/**
 * Created by susha on 6/2/2018.
 */

public class LoginActivity extends AppCompatActivity {
    private Context context = this;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private ProgressDialog progressDialog;

    public static FirebaseAuth mAuth;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnRegister = findViewById(R.id.btnRegister);
        Button btnForgotPassword = findViewById(R.id.btnForgotPassword);
        editTextEmail = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.editTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginAccount();
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, RegisterAccountActivity.class));
            }
        });

        btnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, ForgotPasswordActivity.class));
            }
        });

    }

    private void checkLogin() {
        if (mAuth == null) mAuth = FirebaseAuth.getInstance();
        try {
            String currentUser = mAuth.getCurrentUser().getEmail();
            if (currentUser.equals(String.valueOf(editTextEmail.getText()))) {
                startActivity(new Intent(context, HomeActivity.class));
                finish();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        editTextPassword.setText("");
        recoverFromPreferences();
        checkLogin();
        super.onResume();
    }

    private void recoverFromPreferences() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String email = preferences.getString("email", null);
        if (email != null) {
            editTextEmail.setText(email);
            editTextPassword.requestFocus();
        }
    }

    private void saveToPreferences() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor;
        editor = preferences.edit();
        editor.putString("email", String.valueOf(editTextEmail.getText()));
        String sha = UtilClass.getHash(String.valueOf(editTextPassword.getText()));
        editor.putString("password", sha);
        editor.apply();
    }

    private void loginAccount() {
        String email = String.valueOf(editTextEmail.getText());
        String password = String.valueOf(editTextPassword.getText());
        System.out.println("Email" + email + " ---> " + password);
        if (!email.equals("") && !password.equals("")) {
            if (checkInternetConnection(context)) {
                showProgressDialog("Authenticating...");
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener((Activity) context, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    final FirebaseUser user = mAuth.getCurrentUser();
                                    if (user != null) {
                                        if (user.isEmailVerified()) {
                                            saveToPreferences();
                                            startActivity(new Intent(context, HomeActivity.class));
                                            finish();
                                        } else {
                                            progressDialog.dismiss();
                                            new AlertDialog.Builder(context)
                                                    .setTitle("Email is not verified! Please verify your email!")
                                                    .setPositiveButton("Send Verification", new DialogInterface.OnClickListener() {
                                                        @Override
                                                        public void onClick(DialogInterface dialogInterface, int i) {
                                                            user.sendEmailVerification();
                                                        }
                                                    })
                                                    .show();
                                        }
                                    } else {
                                        showToast("Invalid email or password!");
                                    }
                                } else {
                                    showToast("Invalid email or password!");
                                }
                                progressDialog.dismiss();
                            }
                        });
            } else {
                showToast("Check your Internet Connection");
            }
        } else {
            showToast("Enter a valid email and password!");
        }
    }

    private void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    private void showProgressDialog(String message) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

}
