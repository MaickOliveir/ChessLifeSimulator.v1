package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_1 extends AppCompatActivity {
    private Button button76;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_1);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button76 = (Button) findViewById(R.id.button76);
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame1(); mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame1() {
        Intent intent = new Intent(this, nacional_game1.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}