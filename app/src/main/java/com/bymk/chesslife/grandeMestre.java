package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grandeMestre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grande_mestre);

        Button button078;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button078 = (Button) findViewById(R.id.button078);
        button078.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmenuRoad6(); mediaPlayer.start();
            }
        });
    }

    public void openmenuRoad6() {
        Intent intent = new Intent(this, menuRoad6.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}