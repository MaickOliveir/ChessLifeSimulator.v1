package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_4 extends AppCompatActivity {
    public Button button110;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_4);

        button110 = (Button) findViewById(R.id.button110);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacionalgame4(); mediaPlayer.start();
            }
        });
    }

    public void openinternacionalgame4() {
        Intent intent = new Intent(this, internacional_game4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}