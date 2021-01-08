package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuRoad6 extends AppCompatActivity {

    private static final String PREFS_NAME_CLOSE = "inicializador";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_road6);

        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        SharedPreferences.Editor editorInicializador = configInicializador.edit();

        editorInicializador.putInt("inicializar", 7);
        editorInicializador.commit();

        ImageButton imageButton31 = (ImageButton) findViewById(R.id.imageButton31);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        imageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpanamericanBemVindo(); mediaPlayer.start();
            }
        });
    }

    public void openpanamericanBemVindo() {
        Intent intent = new Intent(this, pan_american_bemVindo.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}