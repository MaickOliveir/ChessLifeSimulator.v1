package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game9);

        Button button72;
        Button button73;


        button72 = (Button) findViewById(R.id.button72);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional10(); mediaPlayer.start();
            }
        });

        button73 = (Button) findViewById(R.id.button73);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void opennacional10() {
        Intent intent = new Intent(this, nacional_10.class);
        startActivity(intent);
    }

    public void nacional_bemVindo() {
        Intent intent = new Intent(this, nacional_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}