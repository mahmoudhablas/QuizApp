package com.example.mahmoud.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mTrueButton,mFalseButton;
    TextView mQuestion,mScore;
    int mIndex = 0,score = 0;
    ProgressBar mprogressBar;
    private TrueOrFalse[] questionsAndAnswers =
            {
                    new TrueOrFalse(R.string.question_1,false),
                    new TrueOrFalse(R.string.question_2,true),
                    new TrueOrFalse(R.string.question_3,true)
            };
    final int INCREMENT_OF_PROGRESSBAR = 100 / questionsAndAnswers.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrueButton =(Button)findViewById(R.id.mButtonTrue);
        mFalseButton =(Button)findViewById(R.id.mButtonFalse);
        mQuestion = (TextView)findViewById(R.id.question);
        mprogressBar = (ProgressBar)findViewById(R.id.progressBar);
        mScore = (TextView) findViewById(R.id.score);
        mQuestion.setText(questionsAndAnswers[mIndex].getmQusetionId());
        mScore.setText("Score " +score+ "/" + questionsAndAnswers.length);
        View.OnClickListener myTrueListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"True is pressed",Toast.LENGTH_SHORT).show();
                if (questionsAndAnswers[mIndex].isTrueOrfalse())
                {
                    score = score + 1;
                    mprogressBar.incrementProgressBy(INCREMENT_OF_PROGRESSBAR);
                    mScore.setText("Score " +score+ "/" + questionsAndAnswers.length);
                }
                updateQuestionText();

            }
        };
        View.OnClickListener myFalseListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"False is pressed",Toast.LENGTH_SHORT).show();
                if (!questionsAndAnswers[mIndex].isTrueOrfalse())
                {
                    score = score + 1;
                    mprogressBar.incrementProgressBy(INCREMENT_OF_PROGRESSBAR);
                    mScore.setText("Score " +score+ "/" + questionsAndAnswers.length);
                }
                updateQuestionText();

            }
        };
        mTrueButton.setOnClickListener(myTrueListner);
        mFalseButton.setOnClickListener(myFalseListner);
    }
    private void updateQuestionText()
    {
        if (mIndex == questionsAndAnswers.length - 1)
        {
            mQuestion.setText("your Score is " + score + "/" + questionsAndAnswers.length );
            mTrueButton.setVisibility(View.GONE);
            mFalseButton.setVisibility(View.GONE);

            return ;
        }
        mIndex = (mIndex + 1)%questionsAndAnswers.length;
        mQuestion.setText(questionsAndAnswers[mIndex].getmQusetionId());
    }
}
