package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quintoInter extends AppCompatActivity {
    public Button button16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto_inter);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinterEscolarGame5(); mediaPlayer.start();
            }
        });

    }
    public void openinterEscolarGame5() {
        Intent intent = new Intent(this, interescolar_game5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}