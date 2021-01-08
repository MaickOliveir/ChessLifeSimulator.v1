package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_6 extends AppCompatActivity {
    public Button button112;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_6);

        button112 = (Button) findViewById(R.id.button112);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame6(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame6() {
        Intent intent = new Intent(this, internacional_game6.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}