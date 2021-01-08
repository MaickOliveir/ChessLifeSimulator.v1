package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_game1);

        Button button32;
        Button button014;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadual2(); mediaPlayer.start();
            }
        });

        button014 = (Button) findViewById(R.id.button014);
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void openestadual2() {
        Intent intent = new Intent(this, estadual_2.class);
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