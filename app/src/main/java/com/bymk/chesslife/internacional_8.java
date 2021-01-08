package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_8 extends AppCompatActivity {
    public Button button114;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_8);

        button114 = (Button) findViewById(R.id.button114);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame8(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame8() {
        Intent intent = new Intent(this, internacional_game8.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}