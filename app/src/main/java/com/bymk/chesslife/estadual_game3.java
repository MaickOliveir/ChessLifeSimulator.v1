package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_game3);

        Button button34;
        Button button018;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadual4(); mediaPlayer.start();
            }
        });


        button018 = (Button) findViewById(R.id.button018);
        button018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void openestadual4() {
        Intent intent = new Intent(this, estadual_4.class);
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