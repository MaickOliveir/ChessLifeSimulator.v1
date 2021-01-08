package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class nacional_bemVindo extends AppCompatActivity {
    private Button button47;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nacional_bem_vindo);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button47 = (Button) findViewById(R.id.button47);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button47.setAnimation(animation);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacional1();  mediaPlayer.start();
            }
        });
    }

    public void opennacional1() {
        Intent intent = new Intent(this, nacional_1.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}