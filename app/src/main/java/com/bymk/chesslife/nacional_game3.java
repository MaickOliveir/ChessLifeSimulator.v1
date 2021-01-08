package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game3);

        Button button50;
        Button button57;
        Button button58;
        Button button59;

        button50 = (Button) findViewById(R.id.button50);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {mediaPlayer.start();
                opennacional4();;
            }
        });

        button57 = (Button) findViewById(R.id.button57);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });

        button58 = (Button) findViewById(R.id.button58);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer2.start();
            }
        });

        button59 = (Button) findViewById(R.id.button59);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer3.start();
            }
        });
    }

    public void opennacional4() {
        Intent intent = new Intent(this, nacional_4.class) ;
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