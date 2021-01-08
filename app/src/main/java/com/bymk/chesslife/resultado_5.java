package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultado_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_5);

        Button button063;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        button063 = (Button) findViewById(R.id.button063);
        button063.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparabens6(); mediaPlayer.start();
            }
        });
    }

    public void openparabens6() {
        Intent intent = new Intent(this, parabens_6.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}