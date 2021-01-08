package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamerican_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamerican_1);

        Button button050;

        button050 = (Button) findViewById(R.id.button050);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button050.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanGame1(); mediaPlayer.start();
            }
        });
    }

    public void openpanamericanGame1() {
        Intent intent = new Intent(this, panamericano_game1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}