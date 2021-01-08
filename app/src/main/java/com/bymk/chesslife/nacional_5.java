package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_5 extends AppCompatActivity {
    private Button button60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_5);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button60 = (Button) findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame5();  mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame5() {
        Intent intent = new Intent(this, nacional_game5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}