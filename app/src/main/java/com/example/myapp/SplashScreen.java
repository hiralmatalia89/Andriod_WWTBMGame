package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread(){
          public void run()
          {
              try {
                  sleep(5000);

              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              finally {
                  Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                  startActivity(intent);
              }
          }
        };
        thread.start();
    }
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}