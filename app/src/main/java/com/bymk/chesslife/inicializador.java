package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;


public class inicializador extends AppCompatActivity {

    int activityInicializador;
    public static final String PREFS_NAME_CLOSE = "inicializador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences configInicializador = getSharedPreferences(PREFS_NAME_CLOSE, MODE_PRIVATE);
        activityInicializador = configInicializador.getInt("inicializar",1);


        if (activityInicializador == 1) {
            Intent modoBotoes = new Intent(this, slashScreen.class);
            startActivity(modoBotoes);
            finish();
        }
        else if(activityInicializador == 2) {
            Intent modojoystick = new Intent(this, menuRoad.class);
            startActivity(modojoystick);
            finish();
        }
        else if(activityInicializador == 3) {
            Intent modojoystick = new Intent(this, menuRoad2.class);
            startActivity(modojoystick);
            finish();
        }
        else if(activityInicializador == 4) {
            Intent modojoystick = new Intent(this, MenuRoad3.class);
            startActivity(modojoystick);
            finish();
        }
        else if(activityInicializador == 5) {
            Intent modojoystick = new Intent(this, MenuRoad4.class);
            startActivity(modojoystick);
            finish();
        }
        else if(activityInicializador == 6) {
            Intent modojoystick = new Intent(this, menuRoad5.class);
            startActivity(modojoystick);
            finish();
        }
        else if(activityInicializador == 7) {
            Intent modojoystick = new Intent(this, menuRoad6.class);
            startActivity(modojoystick);
            finish();
        }
    }
}