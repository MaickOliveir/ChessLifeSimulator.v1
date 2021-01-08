package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamericano_game5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamericano_game5);

        Button button060;
        Button button075;
        Button button076;

        button060 = (Button) findViewById(R.id.button060);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button060.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican6(); mediaPlayer.start();
            }
        });

        button075 = (Button) findViewById(R.id.button075);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button075.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer1.start();
            }
        });

        button076 = (Button) findViewById(R.id.button076);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button076.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer2.start();
            }
        });
    }

    public void openpanamerican6() {
        Intent intent = new Intent(this, panamerican_6.class);
        startActivity(intent);
    }

    public void panamericano_bemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }
}