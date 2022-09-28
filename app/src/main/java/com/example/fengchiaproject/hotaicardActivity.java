package com.example.fengchiaproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class hotaicardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotaicard);
        ImageButton back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(view -> {
            Intent intent = new Intent(hotaicardActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}