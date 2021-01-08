package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game1);

        Button button84;
        Button button63;

        button84 = (Button) findViewById(R.id.button84);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional2(); mediaPlayer.start();
            }
        });

        button63 = (Button) findViewById(R.id.button63);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });
    }

    public void openinternacional2() {
        Intent intent = new Intent(this, internacional_2.class);
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