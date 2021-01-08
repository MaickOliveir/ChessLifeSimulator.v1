package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class interescolarBemVindo extends AppCompatActivity {
    private Button button14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interescolar_bem_vindo);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button14 = (Button) findViewById(R.id.button14);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button14.setAnimation(animation);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinterestadual1(); mediaPlayer.start();
            }
        });
    }

    public void openinterestadual1() {
        Intent intent = new Intent(this, primeraInter.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}