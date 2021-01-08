package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class titulo_mestreFydi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titulo_mestre_fydi);

        Button button105;
        ImageView imageView9;

        imageView9 = findViewById(R.id.imageView9);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        imageView9.setAnimation(animation);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        button105 = (Button) findViewById(R.id.button105);
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqualificacao3(); mediaPlayer.stop();
            }
        });
    }

    public void openqualificacao3() {
        Intent intent = new Intent(this, qualificacao3.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}