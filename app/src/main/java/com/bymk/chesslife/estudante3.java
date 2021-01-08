package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class estudante3 extends AppCompatActivity {
    private Button button19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudante3);

        button19 = (Button) findViewById(R.id.button19);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdGame(); mediaPlayer.start();
            }
        });
    }
    public void openThirdGame() {
        Intent intent = new Intent(this, ThirdGame.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}