package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estadual_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_3);

        Button button39;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualGame3(); mediaPlayer.start();
            }
        });
    }

    public void openestadualGame3() {
        Intent intent = new Intent(this, estadual_game3.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}