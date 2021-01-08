package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class nacional_game10 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game10);

        Button button75;
        Button button74;

        button75 = findViewById(R.id.button75);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openresultado3(); mediaPlayer.start();
            }
        });

        button74 = findViewById(R.id.button74);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void openresultado3() {
        Intent intent = new Intent(this, resultado_3.class);
        startActivity(intent);
    }

    public void nacional_bemVindo() {
        Intent intent = new Intent(this, nacional_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}