package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estudante1 extends AppCompatActivity {
    public Button button17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudante1);

        button17 = (Button) findViewById(R.id.button17);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstGame(); mediaPlayer.start();
            }
        });
    }

    public void openFirstGame() {
        Intent intent = new Intent(this, FirstGame.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}