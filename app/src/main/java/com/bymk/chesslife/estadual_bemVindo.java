package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class estadual_bemVindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadual_bem_vindo);

        Button button25;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button25 = (Button) findViewById(R.id.button25);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button25.setAnimation(animation);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadual1(); mediaPlayer.start();
            }
        });
    }

    public void openestadual1() {
        Intent intent = new Intent(this, estadual_1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}