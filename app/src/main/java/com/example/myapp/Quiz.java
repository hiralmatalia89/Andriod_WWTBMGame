package com.example.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    private TextView questionTV, questionNumberTv;
    private Button option1Btn, option2Btn, option3Btn, option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int CurrentScore = 0, currentEarnings = 0,currentPos = 0;
    SharedPreferences sharedPreferences;
    LinearLayout linearLayoutCheckbox;
    CheckBox Checkbox1,Checkbox2,Checkbox3,Checkbox4;
    Button idbtnCheckbox;
    Date c;
    String formattedDate;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionTV = findViewById(R.id.idTVQuestion);
        questionNumberTv = findViewById(R.id.idTVQuestionAttempted);
        option1Btn = findViewById(R.id.idbtnOption1);
        option2Btn = findViewById(R.id.idbtnOption2);
        option3Btn = findViewById(R.id.idbtnOption3);
        option4Btn = findViewById(R.id.idbtnOption4);
        quizModalArrayList = new ArrayList<>();
        sharedPreferences =  getSharedPreferences("file_quizdata",MODE_PRIVATE);
        //linearLayoutCheckbox = findViewById(R.id.idCheckBoxLayout);
        random = new Random();
        idbtnCheckbox = findViewById(R.id.idbtnCheckbox);
        idbtnCheckbox.setVisibility(View.INVISIBLE);
        getQuizQuestion(quizModalArrayList);
        currentPos =0;
        setDatatoViews(currentPos);
        c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
        formattedDate = df.format(c);

        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                            currentEarnings = currentEarnings + 10000;
                            currentPos++;
                            setDatatoViews(currentPos);
                        }
                        else{
                            showBottomSheet();
                        }


                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                            currentEarnings = currentEarnings + 20000;
                            currentPos++;
                            setDatatoViews(currentPos);
                        }
                        else{
                            showBottomSheet();
                        }
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                            currentEarnings = currentEarnings + 30000;
                            currentPos++;
                            setDatatoViews(currentPos);
                        }
                        else{
                            showBottomSheet();
                        }
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())){
                            CurrentScore++;
                            currentEarnings = currentEarnings + 40000;
                            currentPos++;
                            setDatatoViews(currentPos);
                        }
                        else{
                            showBottomSheet();
                        }
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
        });

        idbtnCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alertDialogue = new AlertDialog.Builder(Quiz.this);
                alertDialogue.setTitle("Are you sure?") ;
                alertDialogue.setCancelable(false);
                alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())){
                            //CurrentScore++;
                            currentEarnings = currentEarnings + 50000;
                            //currentPos++;
                            //setDatatoViews(currentPos);
                        }
                        showBottomSheet();
                    }
                });
                alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = alertDialogue.create();
                dialog.show();

            }
    });
    }

    private void showBottomSheet(){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Quiz.this);
        View bottomsheet = LayoutInflater.from(getApplicationContext()).inflate(R.layout.score_bottom_sheet,(LinearLayout)findViewById(R.id.idLLScore));
        TextView scoreTV = bottomsheet.findViewById(R.id.TVScore);
        Button btnRestartQuiz =  bottomsheet.findViewById(R.id.btnRestartQuiz);
        Button btnExitQuiz =  bottomsheet.findViewById(R.id.btnExitQuiz);
        scoreTV.setText("You Have Won $ \n" + currentEarnings);
        btnRestartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPos = 0;
                currentEarnings = 0;
                setDatatoViews(currentPos);
                CurrentScore = 0;
                bottomSheetDialog.dismiss();
                return;
            }
        });
        btnExitQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomsheet);
        bottomSheetDialog.show();
    }

    private void setDatatoViews(int currentPos) {
        int currentQuestion = currentPos + 1;
        questionNumberTv.setText("Current Earnings : $" + currentEarnings);
        questionTV.setText("Q." +currentQuestion + " " + quizModalArrayList.get(currentPos).getQuestion());
        option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
        option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
        option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
        option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());

    }
    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {
        quizModalArrayList.add(new QuizModal("What types of fragments are in Android?","Dynamic, Static","Connected, Sparse","Sync, Async","Homologous, Heterogeneous","Dynamic, Static"));
        quizModalArrayList.add(new QuizModal("For a single fragment in an activity, what lifecycle callback is called right after it’s host activity is created?","onSaveInstanceState","onCreateView","onResume","onCreate","onCreate"));
        quizModalArrayList.add(new QuizModal("In what version of Android was the concept of a Fragment introduced?","Android 4.0","Android 3.0","Android 2.3","Android 3.4","Android 3.0"));
        quizModalArrayList.add(new QuizModal("What must a Fragment be hosted within?","A View class","The <uses-configuration> tag","An Activity class","The <uses-sdk> tag","An Activity class"));
        quizModalArrayList.add(new QuizModal("An update or modification to a Fragment is performed using what?","A FragmentEdit","A FragmentActivity","A FragmentView","A FragmentTransaction","A FragmentTransaction"));

    }
}