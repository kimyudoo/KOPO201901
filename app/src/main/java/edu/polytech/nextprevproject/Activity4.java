package edu.polytech.nextprevproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity4  extends Activity {

    Button previousButton;
    Button nextButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity4);

        previousButton = findViewById(R.id.Activity4_Previous_Button);
        previousButton.setOnClickListener(onClickListener);
        nextButton = findViewById(R.id.Activity4_Next_Button);
        nextButton.setOnClickListener(onClickListener);
    }

    Button.OnClickListener onClickListener = new Button.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.Activity4_Next_Button:
                    Toast.makeText(Activity4.this, "다음", Toast.LENGTH_SHORT).show();
                    Intent nextIntent = new Intent(getApplicationContext(), Activity5.class);
                    startActivity(nextIntent);
                    finish();
                    break;
                case R.id.Activity4_Previous_Button:
                    Toast.makeText(Activity4.this, "이전", Toast.LENGTH_SHORT).show();
                    Intent previousIntent = new Intent(getApplicationContext(), Activity3.class);
                    startActivity(previousIntent);
                    finish();
                    break;
            }
        }
    };
}
