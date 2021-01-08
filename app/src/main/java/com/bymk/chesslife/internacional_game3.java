package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class internacional_game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional_game3);

        Button button85;
        Button button036;

        button85 = (Button) findViewById(R.id.button85);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.positive);
        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional4(); mediaPlayer.start();
            }
        });

        button036 = (Button) findViewById(R.id.button036);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button036.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                juniorChampiom();mediaPlayer1.start();
            }
        });
    }

    public void openinternacional4() {
        Intent intent = new Intent(this, internacional_4.class);
        startActivity(intent);
    }

    public void juniorChampiom() {
        Intent intent = new Intent(this, juniorChampiom.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}