package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamericano_game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamericano_game3);

        Button button055;
        Button button070;
        Button button071;
        Button button072;


        button055 = (Button) findViewById(R.id.button055);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican4(); mediaPlayer.start();
            }
        });

        button070 = (Button) findViewById(R.id.button070);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button070.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer1.start();
            }
        });

        button071 = (Button) findViewById(R.id.button071);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button071.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer2.start();
            }
        });

        button072 = (Button) findViewById(R.id.button072);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button072.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                panamericano_bemVindo(); mediaPlayer3.start();
            }
        });

    }

    public void openpanamerican4() {
        Intent intent = new Intent(this, panamerican_4.class);
        startActivity(intent);
    }

    public void panamericano_bemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }
}