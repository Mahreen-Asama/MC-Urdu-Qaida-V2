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
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener{

    Button back,share;
    TextView sentence;
    ImageView imgQuiz;
    Button a,b,c,d;
    int imgquiz;
    int righAnswer;   //first one

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("quizImg",imgquiz);   //img id store
        savedInstanceState.putString("opt-a",a.getText().toString());
        savedInstanceState.putString("opt-b",b.getText().toString());
        savedInstanceState.putString("opt-c",c.getText().toString());
        savedInstanceState.putString("opt-d",d.getText().toString());
        savedInstanceState.putInt("rightAns",righAnswer);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int imgid=savedInstanceState.getInt("quizImg");
        imgquiz=imgid;
        imgQuiz.setImageResource(imgid);
        a.setText(savedInstanceState.getString("opt-a"));
        b.setText(savedInstanceState.getString("opt-b"));
        c.setText(savedInstanceState.getString("opt-c"));
        d.setText(savedInstanceState.getString("opt-d"));
        righAnswer=savedInstanceState.getInt("rightAns");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        back=findViewById(R.id.btn_back_quiz);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(QuizActivity.this,QuestionListActivity.class);
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

        Intent intent=getIntent();
        int index=intent.getIntExtra("position",-1);
        Toast.makeText(this,index+"",Toast.LENGTH_SHORT).show();
        if(index==0){
            imgquiz=R.drawable.joker;
            righAnswer=R.id.option_c;
        }
        else if(index==1){
            imgquiz=R.drawable.topi;
            righAnswer=R.id.option_a;
        }
        else if(index==2){
            imgquiz=R.drawable.zkh_removebg_preview;
            righAnswer=R.id.option_d;
        }
        else if(index==3){
            imgquiz=R.drawable.snake1;
            righAnswer=R.id.option_b;
        }
        else if(index==4){
            imgquiz=R.drawable.brtn;
            righAnswer=R.id.option_c;
        }
        else if(index==5){
            imgquiz=R.drawable.tomato;
            righAnswer=R.id.option_a;
        }
        else if(index==6){
            imgquiz=R.drawable.gold;
            righAnswer=R.id.option_d;
        }
        else if(index==7){
            imgquiz=R.drawable.yay_removebg_preview;
            righAnswer=R.id.option_b;
        }
        else if(index==8){
            imgquiz=R.drawable.joker;
            righAnswer=R.id.option_c;
        }
        else if(index==9){
            imgquiz=R.drawable.topi;
            righAnswer=R.id.option_a;
        }

        sentence=findViewById(R.id.choice_sentence);
        imgQuiz=findViewById(R.id.img_quiz);
        a=findViewById(R.id.option_a);
        b=findViewById(R.id.option_b);
        c=findViewById(R.id.option_c);
        d=findViewById(R.id.option_d);

        imgQuiz.setImageResource(imgquiz); //set new image option
        showNewOptions();

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
                TestEnd();
                break;
            default:
                throw new IllegalStateException("unhandled exception: "+imgquiz);
        }
        imgQuiz.setImageResource(imgquiz); //set new image option
    }
    void TestEnd(){
        Intent intent=new Intent(QuizActivity.this,QuizEndActivity.class);
        startActivity(intent);
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
            if(imgquiz==R.drawable.yay_removebg_preview){
                //builder.setTitle("شاباش! آپنے سیکھ لیا ہے        ");     //show dialog box
                //dialog=builder.create();
                //dialog.show();
                TestEnd();     //test end function
            }
            else{
                builder.setTitle("درست جواب - شاباش !          ");     //show dialog box
                dialog=builder.create();
                dialog.show();
                //show next question
                showNewImage();
                showNewOptions();
            }
        }
        else{
            builder.setTitle(" غلط جواب - دوبارہ کوشش کریں !       ");
            dialog=builder.create();
            dialog.show();
        }



    }
}