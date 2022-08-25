package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizEndActivity extends AppCompatActivity {

    Button readAgain, testAgain, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_end);

        readAgain=findViewById(R.id.btn_learn2);
        testAgain=findViewById(R.id.btn_quiz2);
        back=findViewById(R.id.btn_back_quiz2);

        readAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizEndActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        testAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizEndActivity.this,QuestionListActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizEndActivity.this,ChoiceActivity.class);
                startActivity(intent);
            }
        });

    }
}