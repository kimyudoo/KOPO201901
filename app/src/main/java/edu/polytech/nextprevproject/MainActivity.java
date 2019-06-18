package edu.polytech.nextprevproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mResult;
    private String mSelectedString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button)findViewById(R.id.activityMainButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Activity1.class);
                startActivity(intent);
            }
        });

        Button bt2 = (Button)findViewById(R.id.activityMainSpeakButton);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getPackageName());
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ko-KR");
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "실행할 액티비티 번호를 이야기 하세요");
                startActivityForResult(intent,1000);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK && requestCode == 1000) {
            String key = RecognizerIntent.EXTRA_RESULTS;
            mResult = data.getStringArrayListExtra(key);
            String[] result = new String[mResult.size()];
            mResult.toArray(result);
            mSelectedString = mResult.get(0);
            if(mSelectedString.equals("1번")) {
                Intent intent = new Intent(getApplicationContext(), Activity1.class);
                startActivity(intent);
            } else if(mSelectedString.equals("2번")) {
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
            } else if(mSelectedString.equals("3번")) {
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);
            } else if(mSelectedString.equals("4번")) {
                Intent intent = new Intent(getApplicationContext(), Activity4.class);
                startActivity(intent);
            } else if(mSelectedString.equals("5번")) {
                Intent intent = new Intent(getApplicationContext(), Activity5.class);
                startActivity(intent);
            } else if(mSelectedString.equals("6번")) {
                Intent intent = new Intent(getApplicationContext(), Activity6.class);
                startActivity(intent);
            } else if(mSelectedString.equals("7번")) {
                Intent intent = new Intent(getApplicationContext(), Activity7.class);
                startActivity(intent);
            } else if(mSelectedString.equals("8번")) {
                Intent intent = new Intent(getApplicationContext(), Activity8.class);
                startActivity(intent);
            } else if(mSelectedString.equals("9번")) {
                Intent intent = new Intent(getApplicationContext(), Activity9.class);
                startActivity(intent);
            } else if(mSelectedString.equals("10번")) {
                Intent intent = new Intent(getApplicationContext(), Activity10.class);
                startActivity(intent);
            } else if(mSelectedString.equals("11번")) {
                Intent intent = new Intent(getApplicationContext(), Activity11.class);
                startActivity(intent);
            } else if(mSelectedString.equals("12번")) {
                Intent intent = new Intent(getApplicationContext(), Activity12.class);
                startActivity(intent);
            } else if(mSelectedString.equals("13번")) {
                Intent intent = new Intent(getApplicationContext(), Activity13.class);
                startActivity(intent);
            } else if(mSelectedString.equals("14번")) {
                Intent intent = new Intent(getApplicationContext(), Activity14.class);
                startActivity(intent);
            } else if(mSelectedString.equals("15번")) {
                Intent intent = new Intent(getApplicationContext(), Activity15.class);
                startActivity(intent);
            } else if(mSelectedString.equals("16번")) {
                Intent intent = new Intent(getApplicationContext(), Activity16.class);
                startActivity(intent);
            } else if(mSelectedString.equals("17번")) {
                Intent intent = new Intent(getApplicationContext(), Activity17.class);
                startActivity(intent);
            } else if(mSelectedString.equals("18번")) {
                Intent intent = new Intent(getApplicationContext(), Activity18.class);
                startActivity(intent);
            }
        }
    }
}
