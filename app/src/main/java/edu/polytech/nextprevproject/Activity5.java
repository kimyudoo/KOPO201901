package edu.polytech.nextprevproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity5  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5);

        Button BtnPre5 = (Button)findViewById(R.id.BtnPre5);
        Button BtnNext5 = (Button)findViewById(R.id.BtnNext5);

        BtnPre5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity4.class);
                startActivity(intent);
                finish();
            }
        });

        BtnNext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity6.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
