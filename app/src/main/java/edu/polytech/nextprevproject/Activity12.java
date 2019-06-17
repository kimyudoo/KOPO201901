package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity12 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity12);


        Button next12 = (Button) findViewById(R.id.next12);
        next12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity12.this,Activity13.class);
                startActivity(intent);
                finish();
            }
        });

        Button backButton =(Button)findViewById(R.id.back12);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity12.this,Activity11.class);
                startActivity(intent);

            }
        });


    }
}






