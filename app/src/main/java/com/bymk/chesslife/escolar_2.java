package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escolar_2 extends AppCompatActivity {
    private Button button82;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolar_2);

        button82 = (Button) findViewById(R.id.button82);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openescolarGame02(); mediaPlayer.start();
            }
        });
    }


    public void openescolarGame02() {
        Intent intent = new Intent(this, escolar_game2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}