package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class candidatoMestre extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidato_mestre);


        Button button99 = findViewById(R.id.button99);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button99.setAnimation(animation);
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmenuRoad(); mediaPlayer.start();
            }
        });
    }


    public void openmenuRoad() {
        Intent intent = new Intent(this,menuRoad.class);
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}