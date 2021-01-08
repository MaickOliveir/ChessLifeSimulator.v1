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

public class titulo_mestreInternacional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titulo_mestre_internacional);

        Button button048;
        ImageView imageView9;

        imageView9 = findViewById(R.id.imageView9);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        imageView9.setAnimation(animation);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        button048 = (Button) findViewById(R.id.button048);
        button048.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqualificacao4(); mediaPlayer.stop();
            }
        });
    }

    public void openqualificacao4() {
        Intent intent = new Intent(this, qualificacao_4.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}