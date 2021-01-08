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

public class titulo_candidatoMestre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titulo_candidato_mestre);

        Button button103;
        ImageView imageView9;

        imageView9 = findViewById(R.id.imageView9);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        imageView9.setAnimation(animation);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner1);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();

        button103 = (Button) findViewById(R.id.button103);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.avancar);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqualificacao2(); mediaPlayer.start();
            }
        });
    }

    public void openqualificacao2() {
        Intent intent = new Intent(this, qualificacao2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}