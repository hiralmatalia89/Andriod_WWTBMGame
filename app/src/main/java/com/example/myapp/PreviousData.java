package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PreviousData extends AppCompatActivity {
TextView previousData,TotalScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_data);
        previousData = findViewById(R.id.PreviousDate);
        TotalScore = findViewById(R.id.PreviousScore);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("file_quizdata", Context.MODE_PRIVATE);
        String data = sp.getString("DateTime","");
        String score = sp.getString("Score","");
        previousData.setText(data);
        TotalScore.setText(score);
    }
}