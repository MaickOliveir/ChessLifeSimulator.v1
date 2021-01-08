package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interescolar_game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interescolar_game4);

        Button button15;
        Button button010;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquintoInter();mediaPlayer.start();
            }
        });

        button010 = (Button) findViewById(R.id.button010);
        button010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer1.start();
            }
        });
    }
    public void openquintoInter() {
        Intent intent = new Intent(this, quintoInter.class);
        startActivity(intent);
    }

    public void interescolarBemVindo1() {
        Intent intent = new Intent(this, interescolarBemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}