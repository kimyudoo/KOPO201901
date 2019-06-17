package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7);

        Button goBtn;
        Button backBtn;

        goBtn = (Button)findViewById(R.id.activity7go);
         goBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getApplicationContext(), Activity8.class);
                 startActivity(intent);
                 finish();
             }
         });

        backBtn = (Button) findViewById(R.id.activity7back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity6.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
