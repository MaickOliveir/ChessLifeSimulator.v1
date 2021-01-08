package com.bymk.chesslife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class mestreInternacional extends AppCompatActivity {
    public Button button67;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mestre_internacional);

        button67 = (Button) findViewById(R.id.button67);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                ,R.anim.fadein);
        button67.setAnimation(animation);
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmenuRoad5();
            }
        });
    }

    public void openmenuRoad5() {
        Intent intent = new Intent(this, menuRoad5.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        return;
    }
}