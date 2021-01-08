package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class juniorChampiom extends AppCompatActivity {
    public Button button106;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_champiom);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button106 = (Button) findViewById(R.id.button106);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button106.setAnimation(animation);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinternacional1(); mediaPlayer.start();
            }
        });
    }

    public void openinternacional1() {
        Intent intent = new Intent(this, internacional_1.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}