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
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class parabens3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parabens3);

        Button button45;
        ImageView imageView;
        TextView textView22;

        textView22 = findViewById(R.id.textView22);
        YoYo.with(Techniques.Flash)
                .duration(3000)
                .repeat(3)
                .playOn(textView22);

        imageView = findViewById(R.id.imageView21);
        YoYo.with(Techniques.Tada)
                .delay(1000)
                .duration(3000)
                .repeat(3)
                .playOn(imageView);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        imageView.setAnimation(animation2);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        button45 = (Button) findViewById(R.id.button45);

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.avancar);

        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button45.setAnimation(animation3);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentituloCandidatoMestre(); mediaPlayer.start();
            }
        });
    }

    public void opentituloCandidatoMestre() {
        Intent intent = new Intent(this, titulo_candidatoMestre.class);
        startActivity(intent);
    }
}