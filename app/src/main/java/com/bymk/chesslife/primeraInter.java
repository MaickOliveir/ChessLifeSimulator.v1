package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class primeraInter extends AppCompatActivity {
    private Button button21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_inter);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinterEscolarGame1(); mediaPlayer.start();
            }
        });
    }

    public void openinterEscolarGame1() {
        Intent intent = new Intent(this, interescolar_game1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}