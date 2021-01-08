package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_5);

        Button button42;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button42 = (Button) findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualGame5(); mediaPlayer.start();
            }
        });
    }

    public void openestadualGame5() {
        Intent intent = new Intent(this, estadual_game5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}