package com.russrezepov.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4;

    TextView tvScore, tvQuestion;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;

    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random rNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnswer1 = (Button) findViewById(R.id.btnAnswer1);
        btnAnswer2 = (Button) findViewById(R.id.btnAnswer2);
        btnAnswer3 = (Button) findViewById(R.id.btnAnswer3);
        btnAnswer4 = (Button) findViewById(R.id.btnAnswer4);

        tvScore.setText("Score: " + mScore);
        tvScore = (TextView) findViewById(R.id.tvScore);
        tvQuestion = (TextView) findViewById(R.id.tvQuestion);

        updateQuestion(rNumber.nextInt(mQuestionsLength));

        btnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnAnswer1.getText() == mAnswer) {
                    mScore++;
                    tvScore.setText("Score: " + mScore);
                    updateQuestion(rNumber.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        btnAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnAnswer2.getText() == mAnswer) {
                    mScore++;
                    tvScore.setText("Score: " + mScore);
                    updateQuestion(rNumber.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        btnAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnAnswer3.getText() == mAnswer) {
                    mScore++;
                    tvScore.setText("Score: " + mScore);
                    updateQuestion(rNumber.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        btnAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnAnswer4.getText() == mAnswer) {
                    mScore++;
                    tvScore.setText("Score: " + mScore);
                    updateQuestion(rNumber.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int num) {
        tvQuestion.setText(mQuestions.getQuestions(num));

        btnAnswer1.setText((mQuestions.getChoice1(num)));
        btnAnswer2.setText((mQuestions.getChoice2(num)));
        btnAnswer3.setText((mQuestions.getChoice3(num)));
        btnAnswer4.setText((mQuestions.getChoice4(num)));

        mAnswer = mQuestions.getCorrectAnswer(num);

    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! your Score is: " + mScore + "points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));

                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
