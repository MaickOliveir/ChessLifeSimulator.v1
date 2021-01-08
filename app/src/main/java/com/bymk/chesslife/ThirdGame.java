package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_game);

        Button button10;
        Button button006;
        Button button7;
        Button button8;

        button10 = (Button) findViewById(R.id.button10);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParabens1(); mediaPlayer.start();
            }
        });

        button006 = (Button) findViewById(R.id.button006);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.negative);
        button006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer1.start();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.negative);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer2.start();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.negative);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolarBemVindo1();mediaPlayer3.start();
            }
        });
    }

    public void openParabens1() {
        Intent intent = new Intent(this, parabens1.class);
        startActivity(intent);
    }

    public void escolarBemVindo1() {
        Intent intent = new Intent(this, escolar_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}