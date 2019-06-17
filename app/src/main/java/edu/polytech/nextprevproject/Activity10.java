package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity10  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity10);
        Button backbutton10 = (Button) findViewById(R.id.backbutton10);
        Button nextbutton10 = (Button) findViewById(R.id.nextbutton10);
        backbutton10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(),
                    Activity9.class);
            startActivity(intent);
            finish();
        }
    });
        nextbutton10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity11.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
