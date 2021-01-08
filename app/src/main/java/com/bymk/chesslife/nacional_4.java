package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_4 extends AppCompatActivity {
    private Button button79;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_4);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button79 = (Button) findViewById(R.id.button79);
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame4(); mediaPlayer.start();
            }
        });

    }

    public void opennacionalGame4() {
        Intent intent = new Intent(this, nacional_game4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}