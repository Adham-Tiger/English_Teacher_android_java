package com.example.englishteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class   FamilyActivity extends AppCompatActivity {
    ImageView father,mother,grandfather,grandmother;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.family);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.family), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            father=findViewById(R.id.family_father);
            mother=findViewById(R.id.family_mother);
            grandfather=findViewById(R.id.family_Grandfather);
            grandmother=findViewById(R.id.family_Grandmother);
            MediaPlayer Grandmother =MediaPlayer.create(this,R.raw.grand_mother);
            MediaPlayer mp = MediaPlayer.create(this,R.raw.father);
            MediaPlayer Mother = MediaPlayer.create(this,R.raw.mother);
            MediaPlayer Grandfather =MediaPlayer.create(this,R.raw.grand_father);
            father.setOnClickListener(v1 -> {

            mp.start();

            });
            mother.setOnClickListener(v2 -> {

            Mother.start();

            });
            grandfather.setOnClickListener(v3 -> {

            Grandfather.start();


            });
            grandmother.setOnClickListener(v4 -> {

                Grandmother.start();

            });
            return insets;
        });
    }
}

