package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class escolar_game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolar_game1);

        Button button3;
        Button button98;
        Button button001;
        Button button002;

        button3 = findViewById(R.id.button3);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.positive);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openescolar2();
                mediaPlayer.start();
            }
        });

        button98 = (Button) findViewById(R.id.button98);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.negative);
        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();
                mediaPlayer1.start();
            }
        });

        button001 = (Button) findViewById(R.id.button001);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.negative);
        button001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();
                mediaPlayer2.start();
            }
        });

        button002 = (Button) findViewById(R.id.button002);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.negative);
        button002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();
                mediaPlayer3.start();
            }
        });
    }

    public void openescolar2() {
        Intent intent = new Intent(this, escolar_2.class);
        startActivity(intent);
    }

    public void escolarBemVindo1() {
        Intent intent = new Intent(this, escolar_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}
