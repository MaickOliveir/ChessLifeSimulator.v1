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

public class titulo_grandeMestre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titulo_grande_mestre);

        ImageView imageView19;
        Button button079;

        button079 = findViewById(R.id.button079);
        button079.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               MainActivity();
            }
        });

        imageView19 = findViewById(R.id.imageView19);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        imageView19.setAnimation(animation);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        }

    public void MainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onBackPressed() {

    }
}