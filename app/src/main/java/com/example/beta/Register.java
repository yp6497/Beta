package com.example.beta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText et_mail, et_password;
    String emailS, passwordS;
    FirebaseAuth mAuth;
    ProgressBar progressBar_ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        et_mail=(EditText) findViewById(R.id.et_email);
        et_password=(EditText) findViewById(R.id.et_password);
        progressBar_ma=(ProgressBar) findViewById(R.id.progressBar_ma);

        progressBar_ma.setVisibility(View.INVISIBLE);

    }

    public void insertInfo(View view) {
        progressBar_ma.setVisibility(View.VISIBLE);
        String email=et_mail.getText().toString();
        String password=et_password.getText().toString();
        if (!email.isEmpty() && !password.isEmpty())
        {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
            {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        progressBar_ma.setVisibility(View.INVISIBLE);
                        // Sign in success, update UI with the signed-in user's information
                        Toast.makeText(Register.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                        success();
                    }
                    else
                    {
                        progressBar_ma.setVisibility(View.INVISIBLE);
                        Toast.makeText(Register.this, "Registration Error: "+task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            });
            et_mail.setText("");
            et_password.setText("");
        }
        else
        {
            progressBar_ma.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Enter all the required information", Toast.LENGTH_SHORT).show();
        }

    }

    public void success(){

        Intent si = new Intent(this, SignIn.class);
        startActivity(si);
    }

    public void signInScreen(View view) {

        Intent i = new Intent(this, SignIn.class);
        startActivity(i);
    }
}