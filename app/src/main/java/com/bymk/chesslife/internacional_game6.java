package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game6);

        Button button95;
        Button button041;
        Button button042;

        button95 = (Button) findViewById(R.id.button95);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame6(); mediaPlayer.start();
            }
        });

        button041 = (Button) findViewById(R.id.button041);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button041.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });

        button042 = (Button) findViewById(R.id.button042);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button042.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer2.start();
            }
        });
    }

    public void openinternacionalgame6() {
        Intent intent = new Intent(this, internacional_7.class);
        startActivity(intent);
    }

    public void juniorChampiom() {
        Intent intent = new Intent(this, juniorChampiom.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}