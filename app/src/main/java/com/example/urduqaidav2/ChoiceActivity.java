package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChoiceActivity extends AppCompatActivity {

    Button learn,test,share,repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        share = findViewById(R.id.btn_share_choice);
        /*share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                startActivity(intent);
            }
        });*/
        learn = findViewById(R.id.btn_learn);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChoiceActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        test = findViewById(R.id.btn_quiz);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChoiceActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        repo = findViewById(R.id.btn_repo);
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri repolink=Uri.parse("https://github.com/Mahreen-Asama/MC-Urdu-Qaida-V2");
                Intent intent=new Intent(Intent.ACTION_VIEW, repolink);
                startActivity(intent);
            }
        });
    }
}