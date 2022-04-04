package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
Button btnQuizRules, btnStartGames, btnPreviousData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //btnQuizRules = findViewById(R.id.btnQuizRules);
        btnStartGames = findViewById(R.id.btnStartquiz);
        //btnPreviousData = findViewById(R.id.btnPreviousData);
        /*btnQuizRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome.this,QuizRules.class);
                startActivity(intent);
            }
        });*/

        btnStartGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome.this, Quiz.class);
                startActivity(intent);
            }
        });

//        btnPreviousData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Welcome.this,PreviousData.class);
//                startActivity(intent);
//            }
//        });
    }
}