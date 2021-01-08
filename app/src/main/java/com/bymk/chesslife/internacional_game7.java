package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game7);

        Button button96;
        Button button86;
        Button button043;
        Button button044;

        button96 = (Button) findViewById(R.id.button96);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional8(); mediaPlayer.start();
            }
        });

        button86 = (Button) findViewById(R.id.button86);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });

        button043 = (Button) findViewById(R.id.button043);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button043.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer2.start();
            }
        });

        button044 = (Button) findViewById(R.id.button044);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button044.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer3.start();
            }
        });
    }

    public void openinternacional8() {
        Intent intent = new Intent(this, internacional_8.class);
        startActivity(intent);
    }

    public void juniorChampiom() {
        Intent intent = new Intent(this, juniorChampiom.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}