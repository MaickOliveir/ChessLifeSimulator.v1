package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_game);

        Button button9;
        Button button104;
        Button button4;
        Button button5;

        button9 = (Button) findViewById(R.id.button9);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudent2(); mediaPlayer.start();
            }
        });

        button104 = (Button) findViewById(R.id.button104);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer1.start();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer2.start();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer3.start();
            }
        });
    }

    public void openStudent2() {
        Intent intent = new Intent(this, student2.class);
        startActivity(intent);
    }

    public void escolarBemVindo1() {
        Intent intent = new Intent(this, escolar_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}