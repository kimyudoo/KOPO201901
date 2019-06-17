package edu.polytech.nextprevproject;

import android.app.Activity ;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.*;
import android.widget.Button;

public class Activity13 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity13);


    Button btnBeforeActivity = (Button) findViewById(R.id.before13) ;
    btnBeforeActivity.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Activity13.this, Activity12.class);

            startActivity(intent);

        }
    });
    Button btnAfterActivity = (Button) findViewById(R.id.after13);
    btnAfterActivity.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Activity13.this, Activity14.class);

            startActivity(intent);

        }
    });
    }
}