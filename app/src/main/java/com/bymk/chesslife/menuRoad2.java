package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuRoad2 extends AppCompatActivity {
    public ImageButton imageButton999;
    private static final String PREFS_NAME_CLOSE = "inicializador";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_road2);

        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        SharedPreferences.Editor editorInicializador = configInicializador.edit();

        editorInicializador.putInt("inicializar", 3);
        editorInicializador.commit();


        ImageButton imageButton999 = (ImageButton) findViewById(R.id.imageButton999);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        imageButton999.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinterescolarBemVindo(); mediaPlayer.start();
            }
        });
    }

    public void openinterescolarBemVindo() {
        Intent intent = new Intent(this, interescolarBemVindo.class) ;
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}