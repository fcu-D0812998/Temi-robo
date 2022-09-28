package com.example.fengchiaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.os.Debug;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.fengchiaproject.tools.Article;
import com.example.fengchiaproject.tools.GetData;
import com.example.fengchiaproject.tools.OkHttpUtils;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Dialog myDialog;
    Button btnCam;
    final static String url = "https://www.amazingselect.com.tw/list.php?icate=1";
    final static String TAG = "MainActivity";


    /*private Handler handler = new Handler(msg -> {
        Log.i(TAG, "handleMessage: "+ "爬结束");

        switch (msg.what) {
            case 1:
                Log.i(TAG, "handleMessage: " + "开始展示数据");
                ArrayList<Article> articles = (ArrayList<Article>) msg.obj;
                Log.i(TAG, "handleMessage:articles.size() " + articles.size());

                for (Article item : articles) {
                    Log.i(TAG, "handleMessage: " + item.toString());
                }
                break;
            default:
                break;
        }

        return true;
    });*/

    protected void onCreate(Bundle savedInstanceState) {

        myDialog = new Dialog(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton hotaicard_button = findViewById(R.id.hotaicard_button);
        ImageButton hotaipay_button = findViewById(R.id.hotaipay_button);
        ImageButton maintain_button = findViewById(R.id.maintain_button);
        ImageButton collection_button = findViewById(R.id.collection_btn);
        ImageButton navi_button = findViewById(R.id.navi_btn);
        Button hotaicard_btn = findViewById(R.id.card_btn);
        Button hotaipay_btn = findViewById(R.id.pay_btn);
        Button maintain_btn = findViewById(R.id.maintain_btn);
        Button collection_btn = findViewById(R.id.collec_btn);
        ImageButton menu_button = findViewById(R.id.menu_button);

        btnCam = (Button)findViewById(R.id.btnCam);
        btnCam.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
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

    /*private void Test(){


        new Thread(){
            public void run(){
                String html = OkHttpUtils.OkGetArt(url);
                ArrayList<Article> articles = GetData.spiderArticle(html);
                //发送信息给handler用于更新UI界面
                Message message = handler.obtainMessage();
                message.what = 1;
                message.obj = articles;
                handler.sendMessage(message);
            }
        }.start();
    }*/

}