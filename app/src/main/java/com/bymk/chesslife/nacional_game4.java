package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game4);

        Button button51;
        Button button026;
        Button button027;
        Button button028;

        button51 = (Button) findViewById(R.id.button51);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional5(); mediaPlayer.start();
            }
        });

        button026 = (Button) findViewById(R.id.button026);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button026.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });

        button027 = (Button) findViewById(R.id.button027);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button027.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer2.start();
            }
        });

        button028 = (Button) findViewById(R.id.button028);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer3.start();
            }
        });
    }

    public void opennacional5() {
        Intent intent = new Intent(this, nacional_5.class);
        startActivity(intent);
    }

    public void nacional_bemVindo() {
        Intent intent = new Intent(this, nacional_bemVindo.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}