package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_game5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_game5);

        Button button35;
        Button button020;
        Button button021;
        Button button022;


        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button35 = findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();openestadual6();
            }
        });

        button020 = (Button) findViewById(R.id.button020);
        button020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();estadual_bemVindo();
            }
        });

        button021 = (Button) findViewById(R.id.button021);
        button021.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();estadual_bemVindo();
            }
        });

        button022 = (Button) findViewById(R.id.button022);
        button022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();estadual_bemVindo();
            }
        });
    }

    public void openestadual6() {
        Intent intent = new Intent(this, estadual_6.class);
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