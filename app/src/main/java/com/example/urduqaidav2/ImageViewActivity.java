package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageViewActivity extends AppCompatActivity {

    TextView harf,object1,object2;
    ImageView img1,img2;
    Button next,prev,share,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        harf=findViewById(R.id.harf);
        object1=findViewById(R.id.object1);
        object2=findViewById(R.id.object2);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        next=findViewById(R.id.btn_next);
        prev=findViewById(R.id.btn_prev);
        share=findViewById(R.id.btn_share_page);
        back=findViewById(R.id.btn_back_page);

        Intent intent=getIntent();
        int harfId=intent.getIntExtra("harfId", -1);  //get harf
        String harfColor=intent.getStringExtra("harfColor");    //get color


        harf.setTextColor(Color.parseColor(harfColor));    //set harf color
        object1.setTextColor(Color.parseColor(harfColor)); //set words color
        object2.setTextColor(Color.parseColor(harfColor));

        SetResources(harfId);   //set all resources

    }
    void SetResources(int harfId){
        String h="",n1="",n2="";
        int image1 = -1,image2 = -1;

        String s=getResources().getString(R.string.a);

        switch (harfId) {
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alifmad:
                h = getResources().getString(R.string.aa);
                n1 = getResources().getString(R.string.aa1);
                n2 = getResources().getString(R.string.aa2);
                image1 = R.drawable.aam;
                image2 = R.drawable.aankh;
                break;
            case R.id.bay:
                h = getResources().getString(R.string.b);
                n1 = getResources().getString(R.string.b1);
                n2 = getResources().getString(R.string.b2);
                image1 = R.drawable.billi;
                image2 = R.drawable.basta;
                break;
            case R.id.pay:
                h = getResources().getString(R.string.p);
                n1 = getResources().getString(R.string.p1);
                n2 = getResources().getString(R.string.p2);
                image1 = R.drawable.patang;
                image2 = R.drawable.pankha;
                break;
            case R.id.ty:
                h = getResources().getString(R.string.t);
                n1 = getResources().getString(R.string.t1);
                n2 = getResources().getString(R.string.t2);
                image1 = R.drawable.titli;
                image2 = R.drawable.tarbooz;
                break;
            case R.id.tay:
                h = getResources().getString(R.string.ta);
                n1 = getResources().getString(R.string.ta1);
                n2 = getResources().getString(R.string.ta2);
                image1 = R.drawable.tomato;
                image2 = R.drawable.to;
                break;
            case R.id.say:
                h = getResources().getString(R.string.ss);
                n1 = getResources().getString(R.string.ss1);
                n2 = getResources().getString(R.string.ss2);
                image1 = R.drawable.samar;
                image2 = R.drawable.sabit;
                break;
            case R.id.jeem:
                h = getResources().getString(R.string.g);
                n1 = getResources().getString(R.string.g1);
                n2 = getResources().getString(R.string.g2);
                image1 = R.drawable.jahaz;
                image2 = R.drawable.jug;
                break;
            case R.id.chy:
                h = getResources().getString(R.string.ch);
                n1 = getResources().getString(R.string.ch1);
                n2 = getResources().getString(R.string.ch2);
                image1 = R.drawable.sparrow;
                image2 = R.drawable.chaku;
                break;
            case R.id.hy:
                h = getResources().getString(R.string.H);
                n1 = getResources().getString(R.string.H1);
                n2 = getResources().getString(R.string.H2);
                image1 = R.drawable.pool;
                image2 = R.drawable.halwai;
                break;
            case R.id.kh:
                h = getResources().getString(R.string.kh);
                n1 = getResources().getString(R.string.kh1);
                n2 = getResources().getString(R.string.kh2);
                image1 = R.drawable.apricot;
                image2 = R.drawable.rabbit;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;
            case R.id.dal:
                h = getResources().getString(R.string.d);
                n1 = getResources().getString(R.string.d1);
                n2 = getResources().getString(R.string.d2);
                image1 = R.drawable.tree;
                image2 = R.drawable.ink;
                break;


        }
        harf.setText(h);    //set harf
        object1.setText(n1);
        object2.setText(n2);
        img1.setImageResource(image1);
        img2.setImageResource(image2);
    }
}