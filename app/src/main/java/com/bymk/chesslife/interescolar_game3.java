package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interescolar_game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interescolar_game3);

        Button button22;
        Button button009;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquartoInter(); mediaPlayer.start();
            }
        });

        button009 = (Button) findViewById(R.id.button009);
        button009.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer1.start();
            }
        });
    }

    public void openquartoInter() {
        Intent intent = new Intent(this, quartoInter.class);
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