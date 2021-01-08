package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamericano_game6 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamericano_game6);

        Button button062;
        Button button077;

        button062 = findViewById(R.id.button062);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button062.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openresultado5(); mediaPlayer.start();
            }
        });

        button077 = findViewById(R.id.button077);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button077.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer1.start();
            }
        });
    }

    public void openresultado5() {
        Intent intent = new Intent(this, resultado_5.class);
        startActivity(intent);
    }

    public void panamericano_bemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }
}