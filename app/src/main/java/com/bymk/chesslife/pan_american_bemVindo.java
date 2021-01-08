package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class pan_american_bemVindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_american_bem_vindo);

        Button button049;

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button049 = (Button) findViewById(R.id.button049);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button049.setAnimation(animation);
        button049.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamerican1(); mediaPlayer.start();
            }
        });
    }

    public void openpanamerican1() {
        Intent intent = new Intent(this, panamerican_1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}