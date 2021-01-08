package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class interescolar_game5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interescolar_game5);

        Button button26;
        Button button011;
        Button button012;
        Button button013;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);

        button26 = findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openresultado1();mediaPlayer.start();
            }
        });

        button011 = findViewById(R.id.button011);
        button011.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer1.start();
            }
        });

        button012 = findViewById(R.id.button012);
        button012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer2.start();
            }
        });

        button013 = findViewById(R.id.button013);
        button013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer3.start();
            }
        });
    }

    public void openresultado1() {
        Intent intent = new Intent(this, resultado1.class);
        startActivity(intent);
    }

    public void interescolarBemVindo1() {
        Intent intent = new Intent(this, interescolarBemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }

}