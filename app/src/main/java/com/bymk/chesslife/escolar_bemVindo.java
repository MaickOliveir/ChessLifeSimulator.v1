package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class escolar_bemVindo extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolar_bem_vindo);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button2 = (Button) findViewById(R.id.button2);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button2.setAnimation(animation);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openescolar1(); mediaPlayer.start();
            }
        });
    }

    public void openescolar1() {
        Intent intent = new Intent(this, escolar_1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}