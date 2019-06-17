package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Activity3 extends Activity {

    private TextView dateDisplay;
    private Button prev, prior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        dateDisplay = (TextView)findViewById(R.id.date);
        dateDisplay.setText(this.getDate());

        prev = (Button)findViewById(R.id.prev_btn3);
        prior = (Button)findViewById(R.id.prior_btn3);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent1);
            }
        });
        prior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), Activity4.class);
                startActivity(intent2);
            }
        });
    }

    private String getDate(){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
        df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        String currentDateTimeString = df.format(date);

        return currentDateTimeString;
    }
}
