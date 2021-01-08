package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class slashScreen extends AppCompatActivity {
    public static final String PREFS_NAME_CLOSE = "inicializador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_slash_screen);

        View decorView = getWindow().getDecorView();
        // Hide both the navigation bar and the status bar.
        // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
        // a general rule, you should design your app to hide the status bar whenever you
        // hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        SharedPreferences.Editor editorInicializador = configInicializador.edit();

        editorInicializador.putInt("inicializar", 1);
        editorInicializador.commit();

        TextView textView22;
        ImageView imageView18;

       textView22 = findViewById(R.id.textView22);
        YoYo.with(Techniques.FadeOut)
                .delay(1000)
                .duration(3000)
                .repeat(0)
                .playOn(textView22);


        imageView18 = findViewById(R.id.imageView18);
        YoYo.with(Techniques.FadeOut)
                .delay(1000)
                .duration(3000)
                .repeat(0)
                .playOn(imageView18);

        imageView18 = findViewById(R.id.imageView18);
        YoYo.with(Techniques.FadeIn)
                .duration(2000)
                .repeat(0)
                .playOn(imageView18);


        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.intro22);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(slashScreen.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        },3800);
    }
}