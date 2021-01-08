package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuRoad4 extends AppCompatActivity {
    public ImageButton imageButton003;
    private static final String PREFS_NAME_CLOSE = "inicializador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_road4);

        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        SharedPreferences.Editor editorInicializador = configInicializador.edit();

        editorInicializador.putInt("inicializar", 5);
        editorInicializador.commit();

        ImageButton imageButton003 = (ImageButton) findViewById(R.id.imageButton003);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        imageButton003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennacionalbemVindo(); mediaPlayer.start();
            }
        });
    }

    public void opennacionalbemVindo() {
        Intent intent = new Intent(this, nacional_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}