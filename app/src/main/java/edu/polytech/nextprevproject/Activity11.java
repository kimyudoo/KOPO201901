package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity11 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity11);
        setTitle("액티비티11");

    Button backwardButton;
    Button forewardButton;

    backwardButton = (Button)findViewById(R.id.backwardButton);
    forewardButton = (Button)findViewById(R.id.forewardButton);

    backwardButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Activity10.class);
            startActivity(intent);
        }
    });

    forewardButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Activity12.class);
            startActivity(intent);
        }
    });

    }
}
