package com.bymk.chesslife;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class menuRoad extends AppCompatActivity {
    public ImageButton imageButton99;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_road);

        ImageButton imageButton99 = findViewById(R.id.imageButton99);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        imageButton99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openescolarBemVindo(); mediaPlayer.start();
            }
        });
    }

    public void openescolarBemVindo() {
        Intent intent = new Intent(this, escolar_bemVindo.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
    }
}