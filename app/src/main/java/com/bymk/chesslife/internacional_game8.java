package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class internacional_game8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game8);

        Button button88;
        Button button89;
        Button button90;
        Button button065;

        button88 = findViewById(R.id.button88);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openresultado4(); mediaPlayer.start();
            }
        });

        button89 = findViewById(R.id.button89);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom(); mediaPlayer1.start();
            }
        });

        button90 = findViewById(R.id.button90);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom(); mediaPlayer2.start();
            }
        });

        button065 = findViewById(R.id.button065);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button065.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom(); mediaPlayer3.start();
            }
        });
    }

    public void openresultado4() {
        Intent intent = new Intent(this, resultado_4.class);
        startActivity(intent);
    }

    public void juniorChampiom() {
        Intent intent = new Intent(this, juniorChampiom.class);
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}