package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamericano_game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamericano_game4);

        Button button057;
        Button button058;
        Button button073;
        Button button074;


        button057 = (Button) findViewById(R.id.button057);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button057.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican5(); mediaPlayer.start();
            }
        });

        button058 = (Button) findViewById(R.id.button058);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.positive);
        button058.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican5(); mediaPlayer1.start();
            }
        });

        button073 = (Button) findViewById(R.id.button073);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button073.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer2.start();
            }
        });

        button074 = (Button) findViewById(R.id.button074);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button074.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer3.start();
            }
        });

    }

    public void openpanamerican5() {
        Intent intent = new Intent(this, panamerican_5.class);
        startActivity(intent);
    }

    public void panamericano_bemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }
}