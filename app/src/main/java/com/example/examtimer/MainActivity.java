package com.example.examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1;
    TextView myNumber,weAreDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this, R.raw.three);
        myNumber = findViewById(R.id.mNumber);
        weAreDone = findViewById(R.id.done);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millisecondsUntilDone) {

                myNumber.setText("Time: "+String.valueOf(millisecondsUntilDone/1000));
            }

            public void onFinish() {
                m1.start();

                weAreDone.setText("Done!");
            }

        }.start();
    }
}