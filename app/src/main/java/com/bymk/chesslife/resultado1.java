package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultado1 extends AppCompatActivity {

    public Button button28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado1);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        button28 = (Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParabens2(); mediaPlayer.start();
            }
        });
    }

    public void openParabens2() {
        Intent intent = new Intent(this, parabens2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}