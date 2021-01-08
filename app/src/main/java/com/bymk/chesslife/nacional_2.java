package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_2 extends AppCompatActivity {
    private Button button77;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_2);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button77 = (Button) findViewById(R.id.button77);
        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame2(); mediaPlayer.start();
            }
        });
    }

    public void opennacionalGame2() {
        Intent intent = new Intent(this, nacional_game2.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}