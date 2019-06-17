package edu.polytech.nextprevproject;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity18 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity18);

        Button goBack = (Button) findViewById(R.id.backBtn18);
        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button goHome = (Button) findViewById(R.id.homeBtn18);
        goHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intentHome = new Intent(getApplicationContext(), Activity1.class);
                intentHome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intentHome.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentHome);
                finish();
            }
        });
    }
}