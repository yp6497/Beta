package com.example.beta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {

    EditText et_mail, et_password;
    String emailS, passwordS;
    FirebaseAuth mAuth;
    ProgressBar progressBar_ma;
    //boolean stayConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        et_mail = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
        mAuth = FirebaseAuth.getInstance();

        progressBar_ma = (ProgressBar) findViewById(R.id.progressBar_ma);
        progressBar_ma.setVisibility(View.INVISIBLE);

        /*
        SharedPreferences settings = getSharedPreferences("PREFS_NAME", MODE_PRIVATE);
        Boolean isChecked = settings.getBoolean("stayConnect", false);
        Intent si = new Intent(SignIn.this, Main.class);
        if (mAuth.getCurrentUser() != null && isChecked) {
            stayConnect = true;
            startActivity(si);
        }
         */
    }

    public void signIn(View view) {
        progressBar_ma.setVisibility(View.VISIBLE);
        emailS= et_mail.getText().toString();
        passwordS= et_password.getText().toString();

        if (TextUtils.isEmpty(emailS)){
            et_mail.setError("Email Is Required");
        }
        if (TextUtils.isEmpty(passwordS)){
            et_password.setError("Password Is Required");
        }
        else {
            if (passwordS.length() < 6) {
                et_password.setError("Password must be longer than 6 digits");
            }
            else{
                mAuth.signInWithEmailAndPassword(emailS,passwordS).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            progressBar_ma.setVisibility(View.INVISIBLE);
                            Toast.makeText(SignIn.this, "User Signed", Toast.LENGTH_SHORT).show();
                            success();

                        }
                        else{
                            progressBar_ma.setVisibility(View.INVISIBLE);
                            Toast.makeText(SignIn.this, "Error"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }
    }


    public void success(){

        Intent si = new Intent(this, Main.class);
        startActivity(si);
    }

    /**
     * On activity Pause- If logged in & asked to be remembered- kill activity.
     */
    /*
    @Override
    protected void onPause() {
        super.onPause();
        if (stayConnect) finish();
    }
     */
}
