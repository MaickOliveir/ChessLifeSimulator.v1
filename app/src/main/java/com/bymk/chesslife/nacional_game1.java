package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game1);

        Button button48;
        Button button53;

        button48 = (Button) findViewById(R.id.button48);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional2(); mediaPlayer.start();
            }
        });

        button53 = (Button) findViewById(R.id.button53);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void opennacional2() {
        Intent intent = new Intent(this, nacional_2.class) ;
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