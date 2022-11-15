package com.example.fengchiaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import kotlin.jvm.internal.markers.KMutableList;

public class maintainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintain);
        ImageButton back_button = findViewById(R.id.back_button);



        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(maintainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}