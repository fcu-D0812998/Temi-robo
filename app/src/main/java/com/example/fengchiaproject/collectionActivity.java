package com.example.fengchiaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class collectionActivity extends AppCompatActivity {

    private TextView mTextViewResult;
    private RequestQueue mQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        ImageButton back_button = findViewById(R.id.back_button);
        mQueue = Volley.newRequestQueue(this);

        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(collectionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void jsonParse() {
        String url = "http://192.168.99.178:3000/";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONArray jsonArray = new JSONArray();
                    for(int i=0; i<jsonArray.length(); i++){
                        JSONObject employee = jsonArray.getJSONObject(i);
                        String payment = employee.getString("payment");
                        int price = employee.getInt("price");

                        mTextViewResult.append(payment+","+String.valueOf(price)+"\n\n");
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }

}