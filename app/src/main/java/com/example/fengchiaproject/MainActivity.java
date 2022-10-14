package com.example.fengchiaproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    Dialog myDialog;
    final static String url = "https://www.amazingselect.com.tw/list.php?icate=1";
    final static String TAG = "MainActivity";

    protected void onCreate(Bundle savedInstanceState) {

        myDialog = new Dialog(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton hotaicard_button = findViewById(R.id.hotaicard_button);
        ImageButton hotaipay_button = findViewById(R.id.hotaipay_button);
        ImageButton maintain_button = findViewById(R.id.maintain_button);
        ImageButton collection_button = findViewById(R.id.collection_btn);
        ImageButton camera_button = findViewById(R.id.btnCam);
        ImageButton navi_button = findViewById(R.id.navi_btn);
        Button hotaicard_btn = findViewById(R.id.card_btn);
        Button hotaipay_btn = findViewById(R.id.pay_btn);
        Button maintain_btn = findViewById(R.id.maintain_btn);
        Button collection_btn = findViewById(R.id.collec_btn);
        ImageButton menu_button = findViewById(R.id.menu_button);

        camera_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, cameraActivity.class);
                startActivity(intent);
            }
        });
        /*protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data){
            super.onActivityResult(requestCode,resultCode,data);
            if(requestCode == 100){
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                imageview.
            }
        }*/
        hotaicard_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hotaicardActivity.class);
                startActivity(intent);
            }
        });
        hotaipay_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hotaipayActivity.class);
                startActivity(intent);
            }
        });
        maintain_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, maintainActivity.class);
                startActivity(intent);
            }
        });
        collection_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, collectionActivity.class);
                startActivity(intent);
            }
        });
        navi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, positionActivity.class);
                startActivity(intent);
            }
        });
        hotaicard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hotaicardActivity.class);
                startActivity(intent);
            }
        });
        hotaipay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hotaipayActivity.class);
                startActivity(intent);
            }
        });
        maintain_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, maintainActivity.class);
                startActivity(intent);
            }
        });
        collection_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, collectionActivity.class);
                startActivity(intent);
            }
        });



    }

}