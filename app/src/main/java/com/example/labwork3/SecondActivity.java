package com.example.labwork3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = (EditText) findViewById(R.id.messageText);
    }
    public void onClick(View view){
        String message = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }
}