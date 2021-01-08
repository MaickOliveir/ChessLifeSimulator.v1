package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class escolar_1 extends AppCompatActivity {

    private Button button81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolar_1);


        button81 = (Button) findViewById(R.id.button81);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openescolarGame1(); mediaPlayer.start();
            }
        });

    }

    public void openescolarGame1() {
        Intent intent = new Intent(this, escolar_game1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}

