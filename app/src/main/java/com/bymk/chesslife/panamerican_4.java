package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamerican_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamerican_4);

        Button button056;


        button056 = (Button) findViewById(R.id.button056);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button056.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanGame4(); mediaPlayer.start();
            }
        });

    }

    public void openpanamericanGame4() {
        Intent intent = new Intent(this, panamericano_game4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}