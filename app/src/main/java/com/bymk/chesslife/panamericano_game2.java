package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamericano_game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamericano_game2);

        Button button053;
        Button button069;


        button053 = (Button) findViewById(R.id.button053);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button053.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican3(); mediaPlayer.start();
            }
        });

        button069 = (Button) findViewById(R.id.button069);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button069.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer1.start();
            }
        });

    }

    public void openpanamerican3() {
        Intent intent = new Intent(this, panamerican_3.class);
        startActivity(intent);
    }

    public void panamericano_bemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }

}