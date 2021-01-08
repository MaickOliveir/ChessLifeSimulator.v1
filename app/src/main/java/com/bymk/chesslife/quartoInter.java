package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quartoInter extends AppCompatActivity {
    public Button button27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto_inter);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinterEscolarGame4(); mediaPlayer.start();
            }
        });

    }

    public void openinterEscolarGame4() {
        Intent intent = new Intent(this, interescolar_game4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}