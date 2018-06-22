package com.rasmedia.rasmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity { //appCompatActivity is parent class MainActivity is childclass. chjild extends human.
TextView text ;
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = findViewById(R.id.textView);
        Button button = findViewById(R.id.textButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                if (count % 2 == 0)
                    text.setTextColor(RED);
                else
                    text.setTextColor(GREEN);
                count++;



            }
        });


    }
}
