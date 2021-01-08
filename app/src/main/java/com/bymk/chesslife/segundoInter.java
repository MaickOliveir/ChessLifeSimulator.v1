package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segundoInter extends AppCompatActivity {
    public Button button24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_inter);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensegundoInterGame(); mediaPlayer.start();
            }
        });
    }

    public void opensegundoInterGame() {
        Intent intent = new Intent(this, interescolar_game2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}