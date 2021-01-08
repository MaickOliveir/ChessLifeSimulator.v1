package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_9 extends AppCompatActivity {
    private Button button71;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_9);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button71 = (Button) findViewById(R.id.button71);
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame9();  mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame9() {
        Intent intent = new Intent(this, nacional_game9.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}