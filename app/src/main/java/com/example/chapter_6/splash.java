package com.example.chapter_6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splash.this,MainActivity.class));

            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }

      //@Override
  // public boolean onCreateOptionsMenu (Menu menu){
   //   getMenuInflater().inflate(R.menu.splash,menu);
   //   return true;
   // }
}