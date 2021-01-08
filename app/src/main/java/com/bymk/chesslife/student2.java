package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student2 extends AppCompatActivity {
    private Button button18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student2);

        button18 = (Button) findViewById(R.id.button18);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.avancar);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondGame(); mediaPlayer.start();
            }
        });
    }
    public void openSecondGame() {
        Intent intent = new Intent(this, SecondGame.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}