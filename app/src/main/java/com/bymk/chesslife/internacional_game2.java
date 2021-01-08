package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game2);

        Button button91;
        Button button92;
        Button button93;

        button91 = (Button) findViewById(R.id.button91);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional3(); mediaPlayer.start();
            }
        });

        button92 = (Button) findViewById(R.id.button92);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });

        button93 = (Button) findViewById(R.id.button93);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer2.start();
            }
        });
    }

    public void openinternacional3() {
        Intent intent = new Intent(this, internacional_3.class);
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