package edu.polytech.nextprevproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity16  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity16);


        Button toForward = (Button) findViewById(R.id.toForwardBtn);
        Button toNext = (Button) findViewById(R.id.toNextBtn);

        toForward.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),
                        Activity15.class);
                startActivity(intent);
            }
        });

        toNext.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),
                        Activity17.class);
                startActivity(intent);
            }
        });



    }
}
