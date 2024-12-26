package com.example.englishteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColorsActivity extends AppCompatActivity {
    Button black,blue,green,red,white;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.colors);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.colors), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            black=findViewById(R.id.button5);
            blue=findViewById(R.id.button4);
            green=findViewById(R.id.button);
            red=findViewById(R.id.button6);
            white=findViewById(R.id.button7);

            black.setOnClickListener(v1 -> {

                MediaPlayer black =MediaPlayer.create(this,R.raw.black);
                black.start();
            });
            blue.setOnClickListener(v2 -> {
                MediaPlayer blue =MediaPlayer.create(this,R.raw.blue);
                blue.start();
            });
            green.setOnClickListener(v3 -> {
                MediaPlayer green =MediaPlayer.create(this,R.raw.green);
                green.start();
            });
            red.setOnClickListener(v4 -> {
                MediaPlayer red =MediaPlayer.create(this,R.raw.red);
                red.start();
                });
            white.setOnClickListener(v5 -> {
                MediaPlayer white =MediaPlayer.create(this,R.raw.white);
                white.start();
            });

            return insets;
        });
    }
}

