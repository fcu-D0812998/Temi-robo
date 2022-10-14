package com.example.fengchiaproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.robotemi.sdk.Robot;
import com.robotemi.sdk.TtsRequest;
import com.robotemi.sdk.listeners.OnGoToLocationStatusChangedListener;
import com.robotemi.sdk.listeners.OnRobotReadyListener;
import com.robotemi.sdk.navigation.listener.OnCurrentPositionChangedListener;
import com.robotemi.sdk.navigation.model.Position;

public class positionActivity extends AppCompatActivity implements
    OnRobotReadyListener,
    OnCurrentPositionChangedListener,
    OnGoToLocationStatusChangedListener {

        private Robot mRobot;
        private final String TAG = positionActivity.class.getSimpleName();
        public int getTilt(int viewId) {
            EditText text = findViewById(viewId);
            String tiltVal = text.getText().toString();
            if (tiltVal.isEmpty()) {
                text.setText(R.string.defaultTiltValue);
                return 50;
            }
            else {
                return Integer.parseInt(tiltVal);
            }
        }
        public float getFloat(int viewId) {
            EditText text = findViewById(viewId);
            String floatVal = text.getText().toString();
            if (floatVal.isEmpty()) {
                text.setText("0");
                return 0;
            }
            else {
                return Float.parseFloat(floatVal);
            }
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.position);

            mRobot = Robot.getInstance(); //Here we initialize Robot instance

            Button gotoCoordinates = findViewById(R.id.buttonCoordinates);
            Button back_button = findViewById(R.id.back_button);



            back_button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(positionActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
            gotoCoordinates.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float posX = getFloat(R.id.editTextX);
                    float posY = getFloat(R.id.editTextY);
                    float yaw = getFloat(R.id.editTextYaw);
                    int tilt = getTilt(R.id.editTextTilt);
                    mRobot.goToPosition(new Position(posX, posY, yaw, tilt));
                }
            });

            Button homePosition = findViewById(R.id.buttonHome); //Next we defined "homePosition" button and found it by it's viewId
            homePosition.setOnClickListener(new View.OnClickListener() { //setting up OnClickListener for this button
                @Override
                public void onClick(View view) { //function onClick that starts action goTo "HomeBase" which is predefined position saved in Robot.
                    mRobot.goTo("home base");
                }
            });

            Button firstPosition = findViewById(R.id.buttonFirst);
            /*gotoCoordinates.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mRobot.goToPosition(new Position(1.2453,-0.2265,-0.6005,50));
                }
            });*/
            firstPosition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mRobot.goTo("A");
                }
            });

            Button secondPosition = findViewById(R.id.buttonSecond);
            secondPosition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mRobot.goTo("b");
                }
            });

            Button thirdPosition = findViewById(R.id.buttonThird);
            thirdPosition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mRobot.goTo("c");
                }
            });
        }

        @Override
        protected void onStart() {
            super.onStart();
            //Adding event listeners
            mRobot.addOnRobotReadyListener(this);
            mRobot.addOnCurrentPositionChangedListener(this);
            mRobot.addOnGoToLocationStatusChangedListener(this);
        }

        @Override
        protected void onStop() {
            super.onStop();
            //Removing event listeners
            mRobot.removeOnRobotReadyListener(this);
            mRobot.removeOnCurrentPositionChangedListener(this);
            mRobot.removeOnGoToLocationStatusChangedListener(this);
        }

        @Override
        public void onRobotReady(boolean isReady) {
            if (isReady) {
                Log.i(TAG, "Robot is ready");
                mRobot.hideTopBar();
            }
        }

        @Override
        public void onCurrentPositionChanged(@NonNull Position position) {
            TextView textViewPosition = findViewById(R.id.textViewPosition);
            String str = position.toString();
            Log.i(TAG, str);
            textViewPosition.setText(str);
        }

        @Override
        public void onGoToLocationStatusChanged(@NonNull String s, @NonNull String s1, int i, @NonNull String s2) {
            if (s1.equals(COMPLETE)) {
                TtsRequest ttsRequest = TtsRequest.create("I'm here", true);
                mRobot.speak(ttsRequest);
                int tilt = getTilt(R.id.editTextTilt);
                mRobot.tiltAngle(tilt, 1);
            }
        }
}
