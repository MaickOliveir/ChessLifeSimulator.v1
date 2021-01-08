package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamerican_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamerican_3);

        Button button054;


        button054 = (Button) findViewById(R.id.button054);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button054.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanGame3(); mediaPlayer.start();
            }
        });
    }

    public void openpanamericanGame3() {
        Intent intent = new Intent(this, panamericano_game3.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}