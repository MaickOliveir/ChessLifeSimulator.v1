package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interescolar_game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interescolar_game2);

        Button button30;
        Button button008;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openterceiroInterGame(); mediaPlayer.start();
            }
        });

        button008 = (Button) findViewById(R.id.button008);
        button008.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer1.start();
            }
        });
    }

    public void openterceiroInterGame() {
        Intent intent = new Intent(this, terceiroInter.class);
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