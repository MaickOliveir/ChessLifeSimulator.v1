package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_8 extends AppCompatActivity {
    private Button button69;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_8);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button69 = (Button) findViewById(R.id.button69);
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame8();  mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame8() {
        Intent intent = new Intent(this, nacional_game8.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}