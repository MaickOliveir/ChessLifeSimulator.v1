package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_2);

        Button button38;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button38 = (Button) findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualGame2(); mediaPlayer.start();
            }
        });
    }

    public void openestadualGame2() {
        Intent intent = new Intent(this, estadual_game2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}