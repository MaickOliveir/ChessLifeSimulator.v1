package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamerican_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamerican_5);

        Button button059;

        button059 = (Button) findViewById(R.id.button059);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button059.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanGame5(); mediaPlayer.start();
            }
        });
    }

    public void openpanamericanGame5() {
        Intent intent = new Intent(this, panamericano_game5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}