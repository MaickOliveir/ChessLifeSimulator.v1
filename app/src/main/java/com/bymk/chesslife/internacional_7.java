package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_7 extends AppCompatActivity {
    public Button button113;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_7);

        button113 = (Button) findViewById(R.id.button113);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame7(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame7() {
        Intent intent = new Intent(this, internacional_game7.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}