package com.example.urduqaidav2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
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
    int imgquiz = R.drawable.joker;
    int righAnswer = R.id.option_a;   //first one


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        back=findViewById(R.id.btn_back_quiz);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizActivity.this,ChoiceActivity.class);
                startActivity(intent);
            }
        });
        share=findViewById(R.id.btn_share_quiz);
        /*share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                startActivity(intent);
            }
        });*/
        sentence=findViewById(R.id.choice_sentence);
        imgQuiz=findViewById(R.id.img_quiz);
        a=findViewById(R.id.option_a);
        b=findViewById(R.id.option_b);
        c=findViewById(R.id.option_c);
        d=findViewById(R.id.option_d);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
    }
    void showNewImage(){
        switch (imgquiz){
            case R.drawable.joker:
                imgquiz=R.drawable.topi;
                break;
            case R.drawable.topi:
                imgquiz=R.drawable.zkh_removebg_preview;
                break;
            case R.drawable.zkh_removebg_preview:
                imgquiz=R.drawable.snake1;
                break;
            case R.drawable.snake1:
                imgquiz=R.drawable.brtn;
                break;
            case R.drawable.brtn:
                imgquiz=R.drawable.tomato;
                break;
            case R.drawable.tomato:
                imgquiz=R.drawable.gold;
                break;
            case R.drawable.gold:
                imgquiz=R.drawable.yay_removebg_preview;
                break;
            case R.drawable.yay_removebg_preview:
                imgquiz=R.drawable.joker;
                break;
            default:
                throw new IllegalStateException("unhandled exception: "+imgquiz);
        }
        imgQuiz.setImageResource(imgquiz); //set new image option
    }
    void showNewOptions(){
        switch (righAnswer){
            case R.id.option_a:
                a.setText(getResources().getString(R.string.b));
                b.setText(getResources().getString(R.string.g));
                c.setText(getResources().getString(R.string.q));
                d.setText(getResources().getString(R.string.ta));   //for topi
                righAnswer=R.id.option_d;
                break;
            case R.id.option_d:
                a.setText(getResources().getString(R.string.k));
                b.setText(getResources().getString(R.string.z));    //for zakheera
                c.setText(getResources().getString(R.string.b));
                d.setText(getResources().getString(R.string.to));
                righAnswer=R.id.option_b;
                break;
            case R.id.option_b:
                a.setText(getResources().getString(R.string.gn));
                b.setText(getResources().getString(R.string.f));
                c.setText(getResources().getString(R.string.y));    //for snake
                d.setText(getResources().getString(R.string.s));
                righAnswer=R.id.option_c;
                break;
            case R.id.option_c:
                a.setText(getResources().getString(R.string.zo));   //for brtn
                b.setText(getResources().getString(R.string.p));
                c.setText(getResources().getString(R.string.hm));
                d.setText(getResources().getString(R.string.cy));
                righAnswer=R.id.option_a;
                break;
        }
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(QuizActivity.this);
        AlertDialog dialog;

        if(view.getId()==righAnswer){
            builder.setTitle("درست جواب !");     //show dialog box
            dialog=builder.create();
            dialog.show();
            //show next question
            showNewImage();
            showNewOptions();
        }
        else{
            builder.setTitle("دوبارہ کوشش کریں !");
            dialog=builder.create();
            dialog.show();
        }



    }
}