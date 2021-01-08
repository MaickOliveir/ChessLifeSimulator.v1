package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game5);

        Button button94;
        Button button87;
        Button button040;

        button94 = (Button) findViewById(R.id.button94);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional6(); mediaPlayer.start();
            }
        });

        button87 = (Button) findViewById(R.id.button87);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });

        button040 = (Button) findViewById(R.id.button040);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button040.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer2.start();
            }
        });
    }

    public void openinternacional6() {
        Intent intent = new Intent(this, internacional_6.class);
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