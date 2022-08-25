package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestionListActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);

        lv=findViewById(R.id.lv);
        ArrayList<String> numbers=new ArrayList<String>();
        numbers.add("سوال نمبر ۱");
        numbers.add("سوال نمبر ۲");
        numbers.add("سوال نمبر ۳");
        numbers.add("سوال نمبر ۴");
        numbers.add("سوال نمبر ۵");
        numbers.add("سوال نمبر ۶");
        numbers.add("سوال نمبر ۷");
        numbers.add("سوال نمبر ۸");
        numbers.add("سوال نمبر ۹");
        numbers.add("سوال نمبر ۱۰");
        MyAdapter adapter=new MyAdapter(this,0,numbers);
        lv.setAdapter(adapter);

    }
}