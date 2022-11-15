package com.example.fengchiaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    public static String coll_name;
    public static String coll_price;
    private TextView mTextViewResult;
    private RequestQueue mQueue;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText newcontactpopup_quantity;
    private Button newcontactpopup_confirm;
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
        ImageButton coll1 = (ImageButton) findViewById(R.id.coll1_btn);
        ImageButton coll2 = (ImageButton) findViewById(R.id.coll2_btn);
        ImageButton coll3 = (ImageButton) findViewById(R.id.coll3_btn);
        ImageButton coll4 = (ImageButton) findViewById(R.id.coll4_btn);
        ImageButton coll5 = (ImageButton) findViewById(R.id.coll5_btn);
        ImageButton coll6 = (ImageButton) findViewById(R.id.coll6_btn);
        ImageButton coll7 = (ImageButton) findViewById(R.id.coll7_btn);
        ImageButton coll8 = (ImageButton) findViewById(R.id.coll8_btn);
        ImageButton coll9 = (ImageButton) findViewById(R.id.coll9_btn);
        ImageButton coll10 = (ImageButton) findViewById(R.id.coll10_btn);
        ImageButton coll11 = (ImageButton) findViewById(R.id.coll11_btn);
        ImageButton coll12 = (ImageButton) findViewById(R.id.coll12_btn);
        ImageButton coll13 = (ImageButton) findViewById(R.id.coll13_btn);
        ImageButton coll14 = (ImageButton) findViewById(R.id.coll14_btn);
        ImageButton coll15 = (ImageButton) findViewById(R.id.coll15_btn);
        ImageButton coll16 = (ImageButton) findViewById(R.id.coll16_btn);
        ImageButton coll17 = (ImageButton) findViewById(R.id.coll17_btn);
        ImageButton coll18 = (ImageButton) findViewById(R.id.coll18_btn);
        ImageButton coll19 = (ImageButton) findViewById(R.id.coll19_btn);
        ImageButton coll20 = (ImageButton) findViewById(R.id.coll20_btn);
        ImageButton coll21 = (ImageButton) findViewById(R.id.coll21_btn);
        ImageButton coll22 = (ImageButton) findViewById(R.id.coll22_btn);
        ImageButton coll23 = (ImageButton) findViewById(R.id.coll23_btn);
        ImageButton coll24 = (ImageButton) findViewById(R.id.coll24_btn);
        ImageButton coll25 = (ImageButton) findViewById(R.id.coll25_btn);
        ImageButton coll26 = (ImageButton) findViewById(R.id.coll26_btn);
        ImageButton coll27 = (ImageButton) findViewById(R.id.coll27_btn);
        ImageButton coll28 = (ImageButton) findViewById(R.id.coll28_btn);

        coll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "girl_hat";
                coll_price = "360";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "green_coat";
                coll_price = "8380";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "brown_coat";
                coll_price = "8380";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "white_coat";
                coll_price = "4880";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "coaster";
                coll_price = "300";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "blanket";
                coll_price = "1980";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "card holder";
                coll_price = "1320";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "blue_keybag";
                coll_price = "1200";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "black_keybag";
                coll_price = "1200";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "brown_pillow";
                coll_price = "960";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "gray_pillow";
                coll_price = "960";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "water_hat";
                coll_price = "540";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "umbrella";
                coll_price = "2880";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "Block_car";
                coll_price = "1080";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "sport_hat";
                coll_price = "540";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "bag";
                coll_price = "2380";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "green_kettle";
                coll_price = "1380";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "yellow_kettle";
                coll_price = "1380";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "brown_hat";
                coll_price = "360";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "white_hat";
                coll_price = "360";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "white_warmcoat";
                coll_price = "5780";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "black_watercoat";
                coll_price = "11800";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "yellow_watercoat";
                coll_price = "11800";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "umbrella2";
                coll_price = "1080";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "blue_sportcoat";
                coll_price = "4580";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "black_sportcoat";
                coll_price = "4580";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });
        coll27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coll_name = "black_warmcoat";
                coll_price = "4580";
                Intent intent = new Intent(collectionActivity.this,SQLActivity.class);
                startActivity(intent);
            }
        });










    }

    public void createNewContactDialog(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.popup, null);
        newcontactpopup_quantity = (EditText) contactPopupView.findViewById(R.id.quantity);
        newcontactpopup_confirm = (Button) contactPopupView.findViewById(R.id.confirm_btn);

        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        newcontactpopup_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(collectionActivity.this, "購買成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}