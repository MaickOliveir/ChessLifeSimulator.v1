package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuRoad3 extends AppCompatActivity {
    public ImageButton imageButton001;
    private static final String PREFS_NAME_CLOSE = "inicializador";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_road3);

        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        SharedPreferences.Editor editorInicializador = configInicializador.edit();

        editorInicializador.putInt("inicializar", 4);
        editorInicializador.commit();

        ImageButton imageButton001 = (ImageButton) findViewById(R.id.imageButton001);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        imageButton001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openestadualBemVindo(); mediaPlayer.start();
            }
        });
    }

    public void openestadualBemVindo() {
        Intent intent = new Intent(this, estadual_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}