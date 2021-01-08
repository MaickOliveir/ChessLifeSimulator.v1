package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escolar_game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolar_game2);

        Button button80;
        Button button003;
        Button button004;
        Button button005;

        button80 = (Button) findViewById(R.id.button80);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestudante1();  mediaPlayer.start();
            }
        });

        button003 = (Button) findViewById(R.id.button003);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer1.start();
            }
        });

        button004 = (Button) findViewById(R.id.button004);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer2.start();
            }
        });

        button005 = (Button) findViewById(R.id.button005);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer3.start();
            }
        });
    }

    public void openestudante1() {
        Intent intent = new Intent(this, estudante1.class);
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