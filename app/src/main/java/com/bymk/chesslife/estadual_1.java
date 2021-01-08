package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_1);

        Button button37;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualGame1(); mediaPlayer.start();
            }
        });
    }

    public void openestadualGame1() {
        Intent intent = new Intent(this, estadual_game1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}