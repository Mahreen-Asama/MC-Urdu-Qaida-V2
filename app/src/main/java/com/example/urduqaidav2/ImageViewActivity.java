package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                startActivity(intent);
            }
        });
        back=findViewById(R.id.btn_back_page);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ImageViewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

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
                image2 = R.drawable.topi;
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
            case R.id.ddal:
                h = getResources().getString(R.string.dd);
                n1 = getResources().getString(R.string.dd1);
                n2 = getResources().getString(R.string.dd2);
                image1 = R.drawable.doctr;
                image2 = R.drawable.dd2;
                break;
            case R.id.zal:
                h = getResources().getString(R.string.zl);
                n1 = getResources().getString(R.string.zl1);
                n2 = getResources().getString(R.string.zl2);
                image1 = R.drawable.zkh_removebg_preview;
                image2 = R.drawable.gold;
                break;
            case R.id.ry:
                h = getResources().getString(R.string.r);
                n1 = getResources().getString(R.string.r1);
                n2 = getResources().getString(R.string.r2);
                image1 = R.drawable.bear;
                image2 = R.drawable.rick;
                break;
            case R.id.arry:
                h = getResources().getString(R.string.rr);
                n1 = getResources().getString(R.string.rr1);
                n2 = getResources().getString(R.string.rr2);
                image1 = R.drawable.doll;
                image2 = R.drawable.eraser;
                break;
            case R.id.zy:
                h = getResources().getString(R.string.z);
                n1 = getResources().getString(R.string.z1);
                n2 = getResources().getString(R.string.z2);
                image1 = R.drawable.giragge;
                image2 = R.drawable.jewlery;
                break;
            case R.id.yay:
                h = getResources().getString(R.string.y);
                n1 = getResources().getString(R.string.y1);
                n2 = getResources().getString(R.string.y2);
                image1 = R.drawable.yay_removebg_preview;
                image2 = R.drawable.tv;
                break;
            case R.id.seen:
                h = getResources().getString(R.string.s);
                n1 = getResources().getString(R.string.s1);
                n2 = getResources().getString(R.string.s2);
                image1 = R.drawable.apple;
                image2 = R.drawable.cycle;
                break;
            case R.id.sheen:
                h = getResources().getString(R.string.ss);
                n1 = getResources().getString(R.string.ss1);
                n2 = getResources().getString(R.string.ss2);
                image1 = R.drawable.lion;
                image2 = R.drawable.turnip;
                break;
            case R.id.suad:
                h = getResources().getString(R.string.su);
                n1 = getResources().getString(R.string.su1);
                n2 = getResources().getString(R.string.su2);
                image1 = R.drawable.sofa;
                image2 = R.drawable.soap;
                break;
            case R.id.zuad:
                h = getResources().getString(R.string.zu);
                n1 = getResources().getString(R.string.zu1);
                n2 = getResources().getString(R.string.zu2);
                image1 = R.drawable.zaeef;
                image2 = R.drawable.zarb;
                break;
            case R.id.toy:
                h = getResources().getString(R.string.to);
                n1 = getResources().getString(R.string.to1);
                n2 = getResources().getString(R.string.to2);
                image1 = R.drawable.tota;
                image2 = R.drawable.drum;
                break;
            case R.id.zoy:
                h = getResources().getString(R.string.zu);
                n1 = getResources().getString(R.string.zu1);
                n2 = getResources().getString(R.string.zu2);
                image1 = R.drawable.joker;
                image2 = R.drawable.brtn;
                break;
            case R.id.aien:
                h = getResources().getString(R.string.an);
                n1 = getResources().getString(R.string.an1);
                n2 = getResources().getString(R.string.an2);
                image1 = R.drawable.eagle;
                image2 = R.drawable.glasses;
                break;
            case R.id.gain:
                h = getResources().getString(R.string.gn);
                n1 = getResources().getString(R.string.gn1);
                n2 = getResources().getString(R.string.gn2);
                image1 = R.drawable.balooen;
                image2 = R.drawable.bathroom;
                break;
            case R.id.fy:
                h = getResources().getString(R.string.f);
                n1 = getResources().getString(R.string.f1);
                n2 = getResources().getString(R.string.f2);
                image1 = R.drawable.dove;
                image2 = R.drawable.frock;
                break;
            case R.id.qaf:
                h = getResources().getString(R.string.q);
                n1 = getResources().getString(R.string.q1);
                n2 = getResources().getString(R.string.q2);
                image1 = R.drawable.shirt;
                image2 = R.drawable.pen;
                break;
            case R.id.kaf:
                h = getResources().getString(R.string.k);
                n1 = getResources().getString(R.string.k1);
                n2 = getResources().getString(R.string.k2);
                image1 = R.drawable.chair;
                image2 = R.drawable.pc_removebg_preview;
                break;
            case R.id.gaf:
                h = getResources().getString(R.string.gf);
                n1 = getResources().getString(R.string.gf1);
                n2 = getResources().getString(R.string.gf2);
                image1 = R.drawable.gajar;
                image2 = R.drawable.gul;
                break;
            case R.id.lam:
                h = getResources().getString(R.string.l);
                n1 = getResources().getString(R.string.l1);
                n2 = getResources().getString(R.string.l2);
                image1 = R.drawable.lomri;
                image2 = R.drawable.lemon;
                break;
            case R.id.meem:
                h = getResources().getString(R.string.m);
                n1 = getResources().getString(R.string.m1);
                n2 = getResources().getString(R.string.m2);
                image1 = R.drawable.orange;
                image2 = R.drawable.fish2;
                break;
            case R.id.noon:
                h = getResources().getString(R.string.n);
                n1 = getResources().getString(R.string.n1);
                n2 = getResources().getString(R.string.n2);
                image1 = R.drawable.coco;
                image2 = R.drawable.nalka;
                break;
            case R.id.wao:
                h = getResources().getString(R.string.w);
                n1 = getResources().getString(R.string.w1);
                n2 = getResources().getString(R.string.w2);
                image1 = R.drawable.lawyer;
                image2 = R.drawable.wark;
                break;
            case R.id.h:
                h = getResources().getString(R.string.h);
                n1 = getResources().getString(R.string.h1);
                n2 = getResources().getString(R.string.h2);
                image1 = R.drawable.hathi;
                image2 = R.drawable.hand;
                break;
            case R.id.hm:
                h = getResources().getString(R.string.hm);
                n1 = getResources().getString(R.string.hm1);
                n2 = getResources().getString(R.string.hm2);
                image1 = R.drawable.tea;
                image2 = R.drawable.mirror;
                break;
            case R.id.cy:
                h = getResources().getString(R.string.yy);
                n1 = getResources().getString(R.string.yy1);
                n2 = getResources().getString(R.string.yy2);
                image1 = R.drawable.yakka_removebg_preview;
                image2 = R.drawable.yadgar_removebg_preview;
                break;
            case R.id.by:
                h = getResources().getString(R.string.yy);
                n1 = getResources().getString(R.string.yy1);
                n2 = getResources().getString(R.string.yy2);
                image1 = R.drawable.yakka_removebg_preview;
                image2 = R.drawable.yadgar_removebg_preview;
                break;
            default:
                throw new IllegalStateException("Unexpected value: "+harfId);

        }
        harf.setText(h);    //set harf
        object1.setText(n1);
        object2.setText(n2);
        img1.setImageResource(image1);
        img2.setImageResource(image2);
    }
}