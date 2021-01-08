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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class parabens1 extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parabens1);

        Button button20;
        ImageView imageView;
        TextView textView22;

        textView22 = findViewById(R.id.textView22);
        YoYo.with(Techniques.Tada)
                .duration(3000)
                .repeat(3)
                .playOn(textView22);

        imageView = findViewById(R.id.imageView21);
        YoYo.with(Techniques.StandUp)
                .delay(1000)
                .duration(3000)
                .repeat(3)
                .playOn(imageView);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
        ,R.anim.fadein);
        imageView.setAnimation(animation);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();

        button20 = (Button) findViewById(R.id.button20);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button20.setAnimation(animation);

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.avancar);

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    openmenuRoad2();}
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5620680917874511/4106510249");
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              openmenuRoad2(); mediaPlayer.start();
                                          }
                                      }
        );
    }

    public void openmenuRoad2() {
        Intent intent = new Intent(this, menuRoad2.class);
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}