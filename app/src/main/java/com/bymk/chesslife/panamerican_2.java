package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamerican_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamerican_2);

        Button button052;


        button052 = (Button) findViewById(R.id.button052);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button052.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanGame2(); mediaPlayer.start();
            }
        });
    }

    public void openpanamericanGame2() {
        Intent intent = new Intent(this, panamericano_game2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}