package np.com.sushantpaudel.surveyapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import static np.com.sushantpaudel.surveyapplication.LoginActivity.mAuth;
import static np.com.sushantpaudel.surveyapplication.util.UtilClass.checkInternetConnection;

public class ForgotPasswordActivity extends AppCompatActivity {
    private Context context = this;
    private EditText editTextEmailAddress;
    private Button btnForgotPassword;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Null pointer exception not handled.
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        btnForgotPassword = findViewById(R.id.btnForgotPassword);
        btnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotPassword();
            }
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    private void forgotPassword() {
        String email = String.valueOf(editTextEmailAddress.getText());
        if (!email.equals("")) {
            if (checkInternetConnection(context)) {
                showProgressDialog("Authenticating...");
                mAuth.sendPasswordResetEmail(email)
                        .addOnCompleteListener((Activity) context, new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Log.e("LOG", String.valueOf(task.getException()));
                                if (task.isSuccessful()) {
                                    showToast("Check your Email to reset the Password!");
                                } else {
                                    showToast("Task is unsuccessful! Try again later!");
                                }
                            }
                        });
                progressDialog.dismiss();
            } else {
                showToast("Check your Internet Connection!");
            }
        } else {
            showToast("Enter a valid email address!");
        }
    }

    private void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    private void showProgressDialog(String message) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(message);
        progressDialog.show();
    }

}
