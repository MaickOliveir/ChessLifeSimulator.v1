package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nacional_3 extends AppCompatActivity {
    private Button botao78;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_3);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        botao78 = (Button) findViewById(R.id.botao78);
        botao78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalGame3(); mediaPlayer.start();
            }
        });
    }


    public void opennacionalGame3() {
        Intent intent = new Intent(this, nacional_game3.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}