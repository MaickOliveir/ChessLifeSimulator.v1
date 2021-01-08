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


public class parabens4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parabens4);

        Button button;
        TextView textView22;
        ImageView imageView;

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

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        imageView.setAnimation(animation);

        button = (Button) findViewById(R.id.button);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.avancar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentituloMestreFydi(); mediaPlayer1.start();
            }
        });
    }

    public void opentituloMestreFydi() {
        Intent intent = new Intent(this, titulo_mestreFydi.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}