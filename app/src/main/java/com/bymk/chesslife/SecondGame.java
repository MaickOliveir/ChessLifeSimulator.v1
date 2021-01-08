package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_game);

        Button button13;
        Button button11;
        Button button12;
        Button button6;

        button13 = (Button) findViewById(R.id.button13);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEstudante3(); mediaPlayer.start();
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer1.start();
            }
        });

        button12 = (Button) findViewById(R.id.button12);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer2.start();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer3.start();
            }
        });
    }
    public void openEstudante3() {
        Intent intent = new Intent(this, estudante3.class) ;
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