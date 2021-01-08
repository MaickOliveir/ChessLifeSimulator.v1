package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_4);

        Button button40;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button40 = (Button) findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualGame4(); mediaPlayer.start();
            }
        });
    }

    public void openestadualGame4() {
        Intent intent = new Intent(this, estadual_game4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}