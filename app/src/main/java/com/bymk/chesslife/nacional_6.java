package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_6 extends AppCompatActivity {
    private Button button61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_6);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button61 = (Button) findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame6();  mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame6() {
        Intent intent = new Intent(this, nacional_game6.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}