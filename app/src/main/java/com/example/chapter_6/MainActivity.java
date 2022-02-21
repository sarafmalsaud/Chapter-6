package com.example.chapter_6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btMarimba, btMerengue;
    MediaPlayer mpMarimba, mpMerengue;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btMarimba = (Button) findViewById(R.id.btnMarimba);
        Button btMerengue = (Button) findViewById(R.id.btnMerengue);

        mpMarimba = new MediaPlayer();
        MediaPlayer mpMarimba = MediaPlayer.create(this, R.raw.track1);
        mpMerengue = new MediaPlayer();
        MediaPlayer mpMerengue = MediaPlayer.create(this, R.raw.track2);
        playing=0;




        btMarimba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(playing) {
                    case 0:
                        mpMarimba.start();
                        playing = 1;
                        btMarimba.setText("pause Marimba");
                        btMerengue.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpMarimba.pause();
                        playing = 0;
                        btMarimba.setText("play Marimba");
                        btMerengue.setVisibility(View.VISIBLE);
                        break;
                }

            }
        });

        btMerengue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(playing) {
                    case 0:
                        mpMerengue.start();
                        playing = 1;
                        btMerengue.setText("pause merengue");
                        btMarimba.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpMerengue.pause();
                        playing = 0;
                        btMerengue.setText("play merengue");
                        btMarimba.setVisibility(View.VISIBLE);
                        break;
                }

            }
        });


    }
}