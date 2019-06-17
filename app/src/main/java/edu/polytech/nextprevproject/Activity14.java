package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity14  extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity14);

        LinearLayout left = (LinearLayout) findViewById(R.id.buttton1);
        LinearLayout right = (LinearLayout) findViewById(R.id.buttton2);


        left.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity13.class);
                startActivity(intent);

            }

        });

        right.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity15.class);
                startActivity(intent);

            }

        });

    }
}
