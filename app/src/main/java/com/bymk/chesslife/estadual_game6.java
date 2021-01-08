package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class estadual_game6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_game6);

        Button button023;
        Button button024;
        Button button025;

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);

        button023 = findViewById(R.id.button023);

        button023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });

        button024 = findViewById(R.id.button024);
        button024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });

        button025 = (Button) findViewById(R.id.button025);
        button025.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadual_bemVindo();mediaPlayer1.start();
            }
        });
    }

    public void estadual_bemVindo() {
        Intent intent = new Intent(this, estadual_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}