package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class mestre_fydi extends AppCompatActivity {
    public Button button104;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mestre_fydi);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button104 = (Button) findViewById(R.id.button104);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button104.setAnimation(animation);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmenuRoad4(); mediaPlayer.start();
            }
        });
    }

    public void openmenuRoad4() {
        Intent intent = new Intent(this, MenuRoad4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}