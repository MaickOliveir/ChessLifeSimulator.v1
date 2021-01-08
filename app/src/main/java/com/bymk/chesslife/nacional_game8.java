package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_game8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_game8);

        Button button70;
        Button button68;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button70 = (Button) findViewById(R.id.button70);
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional9(); mediaPlayer.start();
            }
        });

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button68 = (Button) findViewById(R.id.button68);
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nacional_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void opennacional9() {
        Intent intent = new Intent(this, nacional_9.class);
        startActivity(intent);
    }

    public void nacional_bemVindo() {
        Intent intent = new Intent(this, nacional_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}