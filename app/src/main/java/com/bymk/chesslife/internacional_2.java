package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_2 extends AppCompatActivity {
    public Button button108;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_2);

        button108 = (Button) findViewById(R.id.button108);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame2(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame2() {
        Intent intent = new Intent(this, internacional_game2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}