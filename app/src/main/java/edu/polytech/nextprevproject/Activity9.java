package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity9 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity9);

        Button AC9prev = (Button)findViewById(R.id.btnAC9prev);
        Button AC9next = (Button)findViewById(R.id.btnAC9next);


        AC9prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity8.class);
                startActivity(intent);
            }
        });

        AC9next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity10.class);
                startActivity(intent);
            }
        });

    }

}
