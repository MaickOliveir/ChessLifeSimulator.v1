package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game5);

        Button button52;
        Button button029;

        button52 = (Button) findViewById(R.id.button52);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional6(); mediaPlayer.start();
            }
        });

        button029 = (Button) findViewById(R.id.button029);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void opennacional6() {
        Intent intent = new Intent(this, nacional_6.class);
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