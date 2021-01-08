package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_1 extends AppCompatActivity {
    public Button button107;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_1);

        button107 = (Button) findViewById(R.id.button107);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame1(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame1() {
        Intent intent = new Intent(this, internacional_game1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}