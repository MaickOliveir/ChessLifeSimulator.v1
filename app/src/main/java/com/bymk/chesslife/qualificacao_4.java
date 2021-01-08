package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qualificacao_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualificacao_4);

        Button button047;

        button047 = (Button) findViewById(R.id.button047);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button047.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengrandeMestre(); mediaPlayer.start();
            }
        });
    }

    public void opengrandeMestre() {
        Intent intent = new Intent(this, grandeMestre.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}