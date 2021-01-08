package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qualificacao2 extends AppCompatActivity {
    public Button button100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualificacao2);

        button100 = (Button) findViewById(R.id.button100);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmestreFydi(); mediaPlayer.start();
            }
        });
    }

    public void openmestreFydi() {
        Intent intent = new Intent(this, mestre_fydi.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}