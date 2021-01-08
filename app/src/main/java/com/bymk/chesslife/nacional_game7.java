package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game7);

        Button button66;
        Button button033;
        Button button034;
        Button button035;

        button66 = (Button) findViewById(R.id.button66);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional8(); mediaPlayer.start();
            }
        });

        button033 = (Button) findViewById(R.id.button033);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button033.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });

        button034 = (Button) findViewById(R.id.button034);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button034.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer2.start();
            }
        });

        button035 = (Button) findViewById(R.id.button035);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button035.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer3.start();
            }
        });
    }

    public void opennacional8() {
        Intent intent = new Intent(this, nacional_8.class);
        startActivity(intent);
    }

    public void nacional_bemVindo() {
        Intent intent = new Intent(this, nacional_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}