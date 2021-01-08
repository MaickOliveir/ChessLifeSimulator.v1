package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_6);

        Button button43;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button43 = (Button) findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualGame6(); mediaPlayer.start();
            }
        });
    }

    public void openestadualGame6() {
        Intent intent = new Intent(this, estadual_game6.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}