package com.example.hilla_000.firststep;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageButton;

public class Game_Matching extends SettingsMenuActivity {

    private boolean continueMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_matching);
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!continueMusic) {
            AppWideAudio.pause();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        continueMusic = false;
        AppWideAudio.start(this, R.raw.maintheme);
    }

}