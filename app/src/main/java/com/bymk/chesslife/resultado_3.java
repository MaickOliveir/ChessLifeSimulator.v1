package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultado_3 extends AppCompatActivity {
    private Button button83;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_3);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.winner2);
        button83 = (Button) findViewById(R.id.button83);
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparabens4(); mediaPlayer.start();
            }
        });
    }

    public void openparabens4() {
        Intent intent = new Intent(this, parabens4.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}