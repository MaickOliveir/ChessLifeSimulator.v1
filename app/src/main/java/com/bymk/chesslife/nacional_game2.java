package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game2);

        Button button49;
        Button button54;
        Button button55;
        Button button56;

        button49 = (Button) findViewById(R.id.button49);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional3(); mediaPlayer.start();
            }
        });

        button54 = (Button) findViewById(R.id.button54);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });

        button55 = (Button) findViewById(R.id.button55);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer2.start();
            }
        });

        button56 = (Button) findViewById(R.id.button56);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer3.start();
            }
        });
    }

    public void opennacional3() {
        Intent intent = new Intent(this, nacional_3.class) ;
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