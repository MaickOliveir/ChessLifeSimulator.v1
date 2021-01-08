package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_3 extends AppCompatActivity {
    public Button button109;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_3);

        button109 = (Button) findViewById(R.id.button109);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame3(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame3() {
        Intent intent = new Intent(this, internacional_game3.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}