package edu.polytech.nextprevproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Activity6  extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity6);

        Button prev = (Button)findViewById(R.id.btPrev);
        prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Activity5.class);
                startActivity(intent);
                finish();

            }
        });

        Button next = (Button)findViewById(R.id.btNext);
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Activity7.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
