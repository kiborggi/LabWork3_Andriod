package com.example.labwork3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView messgeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messgeTextView = (TextView) findViewById(R.id.messageTextView);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        if(message!= null){
            messgeTextView.setText(message);
        }


    }



    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    public void onThird(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}