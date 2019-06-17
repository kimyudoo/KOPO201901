package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity17 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity17);

        Button Button17_1 = (Button) findViewById(R.id.Button17_1);
        Button17_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity16.class);
                startActivity(intent);
                finish();
            }
        });

        Button Button17_2 = (Button) findViewById(R.id.Button17_2);
        Button17_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity18.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
