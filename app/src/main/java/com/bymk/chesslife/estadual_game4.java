package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_game4);

        Button button36;
        Button button019;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadual5(); mediaPlayer.start();
            }
        });


        button019 = (Button) findViewById(R.id.button019);
        button019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void openestadual5() {
        Intent intent = new Intent(this, estadual_5.class);
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