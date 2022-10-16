package com.example.fengchiaproject;

import java.net.HttpURLConnection;
import java.io.IOException;
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
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

import com.google.android.material.button.MaterialButton;

public class SQLActivity extends AppCompatActivity {

    private static HttpURLConnection get_connection;
    private static Scanner in = new Scanner(System.in);
    TextView paymenttmp = (TextView) findViewById(R.id.payment);
    TextView pricetmp = (TextView) findViewById(R.id.price);
    TextView productnametmp = (TextView) findViewById(R.id.productname);
    TextView quantitytmp = (TextView) findViewById(R.id.quantity);
    MaterialButton loginbtn = (MaterialButton) findViewById(R.id.login2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlactivity);
        String url = "http://192.168.100.107:3000/";
        String parameters = "{\"price\": pricetmp,\"payment\":paymenttmp,\"productnametmp\":productnametmp,\"quantity\":quantitytmp}";
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sendPost(url,parameters);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args){

    }

    private static void sendPost(String url, String parameters) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("POST");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(String.valueOf(parameters));
        wr.flush();
        wr.close();

        System.out.println("\n\nURL : " + url);
        System.out.println("Request Method: " + con.getRequestMethod());
        System.out.println("Response Code: " + con.getResponseCode());
        System.out.println("Response Message: " + con.getResponseMessage());

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();

        System.out.println("Response Length: " + response.toString().length());
        File file = new File ("rsp.txt");
        PrintWriter out = new PrintWriter("rsp.txt");
        out.println(response.toString());
        System.out.println("Response copied to rsp.txt.");
    }

}