package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_7 extends AppCompatActivity {
    private Button button64;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_7);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button64 = (Button) findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame7();  mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame7() {
        Intent intent = new Intent(this, nacional_game7.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}