package com.rasmedia.rasmedia;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    private RelativeLayout layout;
    private AnimationDrawable animationDrawable;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        layout = findViewById(R.id.relative_layout_login);
        register = findViewById(R.id.textView_next);

        // onCreate
        animationDrawable =(AnimationDrawable)layout.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(5000);

        // onResume
        animationDrawable.start();

        Button loginButton = findViewById(R.id.loginButton);
        final EditText loginEmail = findViewById(R.id.loginEmail);
        final EditText loginPassword = findViewById(R.id.loginPassword);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailString = loginEmail.getText().toString();
                String passwordEmail = loginPassword.getText().toString();

                validateLogin(emailString,passwordEmail);
//                Intent toMainActivity = new Intent(LoginActivity.this,MainActivity.class);
//                startActivity(toMainActivity);

                Log.e("Login Activity"," login button pressed");


            }
        });




    }

    private void validateLogin(String emailString, String passwordEmail) {
        //@TODO connect to server

    }

    public void OnSuccoes(){

        Intent toMainActivity = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(toMainActivity);


    }

    public void OnFailure( String Message){


    }
}
