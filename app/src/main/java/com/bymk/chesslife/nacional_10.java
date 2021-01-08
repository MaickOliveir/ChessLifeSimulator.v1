package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_10 extends AppCompatActivity {
    private Button button78;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_10);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button78 = (Button) findViewById(R.id.button78);
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame10();  mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame10() {
        Intent intent = new Intent(this, nacional_game10.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}