package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game6);

        Button button62;
        Button button030;
        Button button031;
        Button button032;

        button62 = (Button) findViewById(R.id.button62);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional7(); mediaPlayer.start();
            }
        });

        button030 = (Button) findViewById(R.id.button030);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button030.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });

        button031 = (Button) findViewById(R.id.button031);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button031.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer2.start();
            }
        });

        button032 = (Button) findViewById(R.id.button032);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button032.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer3.start();
            }
        });
    }

    public void opennacional7() {
        Intent intent = new Intent(this, nacional_7.class);
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