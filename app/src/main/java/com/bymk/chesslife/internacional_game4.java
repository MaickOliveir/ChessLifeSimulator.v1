package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game4);

        Button button86;
        Button button037;
        Button button038;
        Button button039;

        button86 = (Button) findViewById(R.id.button86);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional5(); mediaPlayer.start();
            }
        });

        button037 = (Button) findViewById(R.id.button037);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button037.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });

        button038 = (Button) findViewById(R.id.button038);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button038.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer2.start();
            }
        });

        button039 = (Button) findViewById(R.id.button039);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button039.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer3.start();
            }
        });
    }

    public void openinternacional5() {
        Intent intent = new Intent(this, internacional_5.class);
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