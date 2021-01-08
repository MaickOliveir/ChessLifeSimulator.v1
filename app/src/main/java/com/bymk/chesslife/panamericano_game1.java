package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamericano_game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamericano_game1);

        Button button051;
        Button button066;
        Button button067;
        Button button068;


        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button051 = (Button) findViewById(R.id.button051);
        button051.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican2(); mediaPlayer.start();
            }
        });

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button066 = (Button) findViewById(R.id.button066);
        button066.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer1.start();
            }
        });


        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button067 = (Button) findViewById(R.id.button067);
        button067.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer2.start();
            }
        });

        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button068 = (Button) findViewById(R.id.button068);
        button068.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer3.start();
            }
        });
    }

    public void openpanamerican2() {
        Intent intent = new Intent(this, panamerican_2.class);
        startActivity(intent);
    }

    public void panamericano_bemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}