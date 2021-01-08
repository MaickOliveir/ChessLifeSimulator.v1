package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultado_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_4);

        Button button045;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        button045 = (Button) findViewById(R.id.button045);
        button045.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparabens5(); mediaPlayer.start();
            }
        });
    }

    public void openparabens5() {
        Intent intent = new Intent(this, parabens5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}
