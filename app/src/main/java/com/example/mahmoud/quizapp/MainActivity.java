package com.example.mahmoud.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mTrueButton,mFalseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTrueButton =(Button)findViewById(R.id.mButtonTrue);
        mFalseButton =(Button)findViewById(R.id.mButtonFalse);

        View.OnClickListener myTrueListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"True is pressed",Toast.LENGTH_SHORT).show();
            }
        };
        View.OnClickListener myFalseListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"False is pressed",Toast.LENGTH_SHORT).show();
            }
        };
        mTrueButton.setOnClickListener(myTrueListner);
        mFalseButton.setOnClickListener(myFalseListner);
    }
}
