package com.example.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

    public void ShowToast(View view){
        Toast.makeText(this, intent.getStringExtra(MainActivity.EXTRA_MESSAGE), Toast.LENGTH_LONG).show();
    }
}