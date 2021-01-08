package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class interescolar_game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interescolar_game1);

        Button button23;
        Button button007;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensegundaInter(); mediaPlayer.start();
            }
        });

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button007 = (Button) findViewById(R.id.button007);
        button007.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interescolarBemVindo1();mediaPlayer1.start();
            }
        });
    }
    public void opensegundaInter() {
        Intent intent = new Intent(this, segundoInter.class);
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