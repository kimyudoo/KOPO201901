package edu.polytech.nextprevproject;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity1 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button activity1Button1, activity1Button2;
        setContentView(R.layout.activity1);
        activity1Button1 = (Button) findViewById(R.id.activity1Button1);
        activity1Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        activity1Button2 = (Button) findViewById(R.id.activity1Button2);
        activity1Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent1);

            }


        });
    }
}