package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_game2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_game2);

        Button button33;
        Button button015;
        Button button016;
        Button button017;


        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadual3(); mediaPlayer.start();}});

        button015 = (Button) findViewById(R.id.button015);
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });


        button016 = (Button) findViewById(R.id.button016);
        button016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });

        button017 = (Button) findViewById(R.id.button017);
        button017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void openestadual3() {
        Intent intent = new Intent(this, estadual_3.class);
        startActivity(intent);
    }

    public void estadual_bemVindo() {
        Intent intent = new Intent(this, estadual_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}