package com.example.fengchiaproject;

import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.lang.*;
import java.io.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.net.URLConnection;

import com.google.android.material.button.MaterialButton;

public class SQLActivity extends AppCompatActivity {

    private static HttpURLConnection get_connection;
    private static Scanner in = new Scanner(System.in);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);
        //TextView paymenttmp = (TextView) findViewById(R.id.payment);
        //TextView pricetmp = (TextView) findViewById(R.id.price);
        //TextView productnametmp = (TextView) findViewById(R.id.productname);
        TextView quantitytmp = (TextView) findViewById(R.id.quantity);
        Button loginbtn = (Button) findViewById(R.id.confirm_btn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String payment_infor = paymenttmp.getText().toString();
                //String price_infor = pricetmp.getText().toString();
                //String productname_infor = productnametmp.getText().toString();
                String quantity_infor = quantitytmp.getText().toString();
                Thread thread = new Thread(new Runnable(){
                    @Override
                    public void run(){
                        //code to do the HTTP request
                        try {
                            URL restURL = new URL("http://192.168.0.101:3000/");

                            HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
                            conn.setRequestMethod("POST");
                            conn.setRequestProperty("Content-Type", "application/json");
                            conn.setRequestProperty("Accept", "application/json");
                            conn.setDoOutput(true);
                            String pay = "linepay",product = "computer";
                            String query = String.format("{\"price\": %s,\"payment\":\"cash\",\"productname\":\"%s\",\"quantity\":%s}",collectionActivity.coll_price,collectionActivity.coll_name,quantity_infor);
                            try(OutputStream os = conn.getOutputStream()) {
                                byte[] input = query.getBytes("utf-8");
                                os.write(input, 0, input.length);
                            }
                            try(BufferedReader br = new BufferedReader(
                                    new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                                StringBuilder response = new StringBuilder();
                                String responseLine = null;
                                while ((responseLine = br.readLine()) != null) {
                                    response.append(responseLine.trim());
                                }
                                System.out.println(response.toString());
                            }
                            Toast.makeText(SQLActivity.this, "購買成功", Toast.LENGTH_SHORT).show();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();

            }
        });
    }


}