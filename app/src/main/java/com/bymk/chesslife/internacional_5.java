package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_5 extends AppCompatActivity {
    public Button button111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_5);

        button111 = (Button) findViewById(R.id.button111);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame5(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame5() {
        Intent intent = new Intent(this, internacional_game5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}