package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultado2 extends AppCompatActivity {
    private Button button46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado2);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparabens3(); mediaPlayer.start();
            }
        });
    }

    public void openparabens3() {
        Intent intent = new Intent(this, parabens3.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}