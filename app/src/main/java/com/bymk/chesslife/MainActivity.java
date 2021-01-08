package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String PREFS_NAME_CLOSE = "inicializador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1;

        button1 = (Button) findViewById(R.id.button1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqualificacao1(); mediaPlayer.start();
            }
        });
    }

    public void openqualificacao1() {
        Intent intent = new Intent(this, qualificacao1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}