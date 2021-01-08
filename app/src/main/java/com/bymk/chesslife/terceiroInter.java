package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class terceiroInter extends AppCompatActivity {
    public Button button40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro_inter);


        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button40 = (Button) findViewById(R.id.button41);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinterescolarGame3(); mediaPlayer.start();
            }
        });
    }
    public void openinterescolarGame3() {
        Intent intent = new Intent(this, interescolar_game3.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}