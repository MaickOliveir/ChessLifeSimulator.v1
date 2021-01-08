package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panamerican_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panamerican_6);

        Button button061;

        button061 = (Button) findViewById(R.id.button061);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button061.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanGame6(); mediaPlayer.start();
            }
        });
    }

    public void openpanamericanGame6() {
        Intent intent = new Intent(this, panamericano_game6.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}