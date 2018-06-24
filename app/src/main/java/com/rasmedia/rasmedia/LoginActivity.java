package com.rasmedia.rasmedia;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {


    private RelativeLayout layout;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        layout = findViewById(R.id.relative_layout_login);
        // onCreate
        animationDrawable =(AnimationDrawable)layout.getBackground();
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.setExitFadeDuration(5000);
// onResume
        animationDrawable.start();

    }
}
