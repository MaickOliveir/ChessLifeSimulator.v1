package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qualificacao1 extends AppCompatActivity {
    private Button button97;
    private Button button101;
    private static final String PREFS_NAME_CLOSE = "inicializador";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualificacao1);



        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        SharedPreferences.Editor editorInicializador = configInicializador.edit();

        editorInicializador.putInt("inicializar", 2);
        editorInicializador.commit();

        button97 = (Button) findViewById(R.id.button97);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmenuRoad1();mediaPlayer.start();
            }
        });
    }

    public void openmenuRoad1() {
        Intent intent = new Intent(this, candidatoMestre.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}