package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qualificacao3 extends AppCompatActivity {
    public Button button101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualificacao3);

        button101 = (Button) findViewById(R.id.button101);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmestreInternacional(); mediaPlayer.start();
            }
        });
    }

    public void openmestreInternacional() {
        Intent intent = new Intent(this, mestreInternacional.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}