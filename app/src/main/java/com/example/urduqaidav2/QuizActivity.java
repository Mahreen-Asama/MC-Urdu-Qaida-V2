package com.example.urduqaidav2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Button back,share;
    TextView sentence;
    ImageView imgQuiz;
    Button a,b,c,d;
    AlertDialog.Builder builder;
    int[] quizImages= {
            //10 images for quiz
            R.drawable.anar, R.drawable.topi, R.drawable.zkh_removebg_preview, R.drawable.tv,
            R.drawable.brtn, R.drawable.gul, R.drawable.fish2, R.drawable.lawyer, R.drawable.yakka_removebg_preview
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        back=findViewById(R.id.btn_back_quiz);
        share=findViewById(R.id.btn_share_quiz);
        sentence=findViewById(R.id.choice_sentence);
        imgQuiz=findViewById(R.id.img_quiz);
        a=findViewById(R.id.option_a);
        b=findViewById(R.id.option_b);
        c=findViewById(R.id.option_c);
        d=findViewById(R.id.option_d);

        back.setOnClickListener(this);
        share.setOnClickListener(this);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog dialog=builder.create();
        if(view.getId()==)
    }
}