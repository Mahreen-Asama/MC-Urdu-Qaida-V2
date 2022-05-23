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
    int harfId=-1;
    int img1Id=-1,img2Id=-1;

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("harfID",harfId);
        /*savedInstanceState.putString("obj1",object1.getText().toString());
        savedInstanceState.putString("obj2",object2.getText().toString());
        savedInstanceState.putInt("img1",img1.getImageAlpha());
        savedInstanceState.putInt("img2",img2.getImageAlpha());*/
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int hid=savedInstanceState.getInt("harfID");
        SetResources(hid);
        /*harf.setText(savedInstanceState.getString("harff"));
        object1.setText(savedInstanceState.getString("obj1"));
        object2.setText(savedInstanceState.getString("obj2"));
        img1.setImageResource(savedInstanceState.getInt("img1"));
        img2.setImageResource(savedInstanceState.getInt("img2"));*/
    }
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
        /*share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                startActivity(intent);
            }
        });*/
        back=findViewById(R.id.btn_back_page);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ImageViewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        harfId=intent.getIntExtra("harfId", -1);  //get harf
        //int harfColor=intent.getIntExtra("harfColor", -1);    //get color


        //harf.setTextColor(harfColor);    //set harf color
        //object1.setTextColor(Color.parseColor(harfColor)); //set words color
        //object2.setTextColor(Color.parseColor(harfColor));

        SetResources(harfId);   //set all resources

        //---------------previous btn----------
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToPreviousPage(harfId);
            }
        });
        //---------------next btn----------
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoToNextPage(harfId);
            }
        });
    }
    void setCyBy(){
        //choti y, bari y
        harf.setText(getResources().getString(R.string.yy));    //set harf
        object1.setText(getResources().getString(R.string.yy1));
        object2.setText(getResources().getString(R.string.yy2));
        img1.setImageResource(R.drawable.yakka_removebg_preview);
        img2.setImageResource(R.drawable.yadgar_removebg_preview);
        harfId=R.id.cy;
    }
    void setAlif(){
        harf.setText(getResources().getString(R.string.a));    //set harf
        object1.setText(getResources().getString(R.string.a1));
        object2.setText(getResources().getString(R.string.a2));
        img1.setImageResource(R.drawable.anar);
        img2.setImageResource(R.drawable.angoor);
        harfId=R.id.alif;
    }
    void setAlifMad(){
        harf.setText(getResources().getString(R.string.aa));    //set harf
        object1.setText(getResources().getString(R.string.aa1));
        object2.setText(getResources().getString(R.string.aa2));
        img1.setImageResource(R.drawable.aam);
        img2.setImageResource(R.drawable.aankh);
        harfId=R.id.alifmad;
    }
    void setBay(){
        harf.setText(getResources().getString(R.string.b));    //set harf
        object1.setText(getResources().getString(R.string.b1));
        object2.setText(getResources().getString(R.string.b2));
        img1.setImageResource(R.drawable.cat1);
        img2.setImageResource(R.drawable.basta);
        harfId=R.id.bay;
    }
    void setPay(){
        harf.setText(getResources().getString(R.string.p));    //set harf
        object1.setText(getResources().getString(R.string.p1));
        object2.setText(getResources().getString(R.string.p2));
        img1.setImageResource(R.drawable.patang);
        img2.setImageResource(R.drawable.pankha);
        harfId=R.id.pay;
    }
    void setTy(){
        harf.setText(getResources().getString(R.string.t));    //set harf
        object1.setText(getResources().getString(R.string.t1));
        object2.setText(getResources().getString(R.string.t2));
        img1.setImageResource(R.drawable.titli);
        img2.setImageResource(R.drawable.tarbooz);
        harfId=R.id.ty;
    }
    void setTay(){
        harf.setText(getResources().getString(R.string.ta));    //set harf
        object1.setText(getResources().getString(R.string.ta1));
        object2.setText(getResources().getString(R.string.ta2));
        img1.setImageResource(R.drawable.tomato);
        img2.setImageResource(R.drawable.topi);
        harfId=R.id.tay;
    }
    void setSay(){
        harf.setText(getResources().getString(R.string.ss));    //set harf
        object1.setText(getResources().getString(R.string.ss1));
        object2.setText(getResources().getString(R.string.ss2));
        img1.setImageResource(R.drawable.samar);
        img2.setImageResource(R.drawable.sabit);
        harfId=R.id.say;
    }
    void setJeem(){
        harf.setText(getResources().getString(R.string.g));    //set harf
        object1.setText(getResources().getString(R.string.g1));
        object2.setText(getResources().getString(R.string.g2));
        img1.setImageResource(R.drawable.jahaz);
        img2.setImageResource(R.drawable.jug);
        harfId=R.id.jeem;
    }
    void setChay(){
        harf.setText(getResources().getString(R.string.ch));    //set harf
        object1.setText(getResources().getString(R.string.ch1));
        object2.setText(getResources().getString(R.string.ch2));
        img1.setImageResource(R.drawable.sparrow);
        img2.setImageResource(R.drawable.chaku);
        harfId=R.id.chy;
    }
    void setHy(){
        harf.setText(getResources().getString(R.string.H));    //set harf
        object1.setText(getResources().getString(R.string.H1));
        object2.setText(getResources().getString(R.string.H2));
        img1.setImageResource(R.drawable.pool);
        img2.setImageResource(R.drawable.halwai);
        harfId=R.id.hy;
    }
    void setKh(){
        harf.setText(getResources().getString(R.string.kh));    //set harf
        object1.setText(getResources().getString(R.string.kh1));
        object2.setText(getResources().getString(R.string.kh2));
        img1.setImageResource(R.drawable.apricot);
        img2.setImageResource(R.drawable.rabbit);
        harfId=R.id.kh;
    }
    void setDal(){
        harf.setText(getResources().getString(R.string.d));    //set harf
        object1.setText(getResources().getString(R.string.d1));
        object2.setText(getResources().getString(R.string.d2));
        img1.setImageResource(R.drawable.tree);
        img2.setImageResource(R.drawable.ink);
        harfId=R.id.dal;
    }
    void setDdal(){
        harf.setText(getResources().getString(R.string.dd));    //set harf
        object1.setText(getResources().getString(R.string.dd1));
        object2.setText(getResources().getString(R.string.dd2));
        img1.setImageResource(R.drawable.doctr);
        img2.setImageResource(R.drawable.dd2);
        harfId=R.id.ddal;
    }
    void setZal(){
        harf.setText(getResources().getString(R.string.zl));    //set harf
        object1.setText(getResources().getString(R.string.zl1));
        object2.setText(getResources().getString(R.string.zl2));
        img1.setImageResource(R.drawable.zkh_removebg_preview);
        img2.setImageResource(R.drawable.gold);
        harfId=R.id.zal;
    }
    void setRy(){
        harf.setText(getResources().getString(R.string.r));    //set harf
        object1.setText(getResources().getString(R.string.r1));
        object2.setText(getResources().getString(R.string.r2));
        img1.setImageResource(R.drawable.bear);
        img2.setImageResource(R.drawable.rick);
        harfId=R.id.ry;
    }
    void setArry(){
        harf.setText(getResources().getString(R.string.rr));    //set harf
        object1.setText(getResources().getString(R.string.rr1));
        object2.setText(getResources().getString(R.string.rr2));
        img1.setImageResource(R.drawable.doll);
        img2.setImageResource(R.drawable.eraser);
        harfId=R.id.arry;
    }
    void setZy(){
        harf.setText(getResources().getString(R.string.z));    //set harf
        object1.setText(getResources().getString(R.string.z1));
        object2.setText(getResources().getString(R.string.z2));
        img1.setImageResource(R.drawable.giragge);
        img2.setImageResource(R.drawable.jewlery);
        harfId=R.id.zy;
    }
    void setYay(){
        harf.setText(getResources().getString(R.string.y));    //set harf
        object1.setText(getResources().getString(R.string.y1));
        object2.setText(getResources().getString(R.string.y2));
        img1.setImageResource(R.drawable.yay_removebg_preview);
        img2.setImageResource(R.drawable.snake1);
        harfId=R.id.yay;
    }
    void setSeen(){
        harf.setText(getResources().getString(R.string.s));    //set harf
        object1.setText(getResources().getString(R.string.s1));
        object2.setText(getResources().getString(R.string.s2));
        img1.setImageResource(R.drawable.apple);
        img2.setImageResource(R.drawable.cycle);
        harfId=R.id.seen;
    }
    void setSheen(){
        harf.setText(getResources().getString(R.string.sh));    //set harf
        object1.setText(getResources().getString(R.string.sh1));
        object2.setText(getResources().getString(R.string.sh2));
        img1.setImageResource(R.drawable.lion);
        img2.setImageResource(R.drawable.turnip);
        harfId=R.id.sheen;
    }
    void setSuad(){
        harf.setText(getResources().getString(R.string.su));    //set harf
        object1.setText(getResources().getString(R.string.su1));
        object2.setText(getResources().getString(R.string.su2));
        img1.setImageResource(R.drawable.sofa);
        img2.setImageResource(R.drawable.soap);
        harfId=R.id.suad;
    }
    void setZuad(){
        harf.setText(getResources().getString(R.string.zu));    //set harf
        object1.setText(getResources().getString(R.string.zu1));
        object2.setText(getResources().getString(R.string.zu2));
        img1.setImageResource(R.drawable.zaeef);
        img2.setImageResource(R.drawable.zarb);
        harfId=R.id.zuad;
    }
    void setToy(){
        harf.setText(getResources().getString(R.string.to));    //set harf
        object1.setText(getResources().getString(R.string.to1));
        object2.setText(getResources().getString(R.string.to2));
        img1.setImageResource(R.drawable.tota);
        img2.setImageResource(R.drawable.drum);
        harfId=R.id.toy;
    }
    void setZoy(){
        harf.setText(getResources().getString(R.string.zo));    //set harf
        object1.setText(getResources().getString(R.string.zo1));
        object2.setText(getResources().getString(R.string.zo2));
        img1.setImageResource(R.drawable.joker);
        img2.setImageResource(R.drawable.brtn);
        harfId=R.id.zoy;
    }
    void setAien(){
        harf.setText(getResources().getString(R.string.an));    //set harf
        object1.setText(getResources().getString(R.string.an1));
        object2.setText(getResources().getString(R.string.an2));
        img1.setImageResource(R.drawable.eagle);
        img2.setImageResource(R.drawable.glasses);
        harfId=R.id.aien;
    }
    void setGain(){
        harf.setText(getResources().getString(R.string.gn));    //set harf
        object1.setText(getResources().getString(R.string.gn1));
        object2.setText(getResources().getString(R.string.gn2));
        img1.setImageResource(R.drawable.balooen);
        img2.setImageResource(R.drawable.kaleen);
        harfId=R.id.gain;
    }
    void setFay(){
        harf.setText(getResources().getString(R.string.f));    //set harf
        object1.setText(getResources().getString(R.string.f1));
        object2.setText(getResources().getString(R.string.f2));
        img1.setImageResource(R.drawable.dove);
        img2.setImageResource(R.drawable.frock);
        harfId=R.id.fy;
    }
    void setQaf(){
        harf.setText(getResources().getString(R.string.q));    //set harf
        object1.setText(getResources().getString(R.string.q1));
        object2.setText(getResources().getString(R.string.q2));
        img1.setImageResource(R.drawable.shirt);
        img2.setImageResource(R.drawable.pen);
        harfId=R.id.qaf;
    }
    void setKaf(){
        harf.setText(getResources().getString(R.string.k));    //set harf
        object1.setText(getResources().getString(R.string.k1));
        object2.setText(getResources().getString(R.string.k2));
        img1.setImageResource(R.drawable.chair);
        img2.setImageResource(R.drawable.pc_removebg_preview);
        harfId=R.id.kaf;
    }
    void setGaf(){
        harf.setText(getResources().getString(R.string.gf));    //set harf
        object1.setText(getResources().getString(R.string.gf1));
        object2.setText(getResources().getString(R.string.gf2));
        img1.setImageResource(R.drawable.gajar);
        img2.setImageResource(R.drawable.gul);
        harfId=R.id.gaf;
    }
    void setLaam(){
        harf.setText(getResources().getString(R.string.l));    //set harf
        object1.setText(getResources().getString(R.string.l1));
        object2.setText(getResources().getString(R.string.l2));
        img1.setImageResource(R.drawable.lomri);
        img2.setImageResource(R.drawable.lemon);
        harfId=R.id.lam;
    }
    void setMeem(){
        harf.setText(getResources().getString(R.string.m));    //set harf
        object1.setText(getResources().getString(R.string.m1));
        object2.setText(getResources().getString(R.string.m2));
        img1.setImageResource(R.drawable.orange);
        img2.setImageResource(R.drawable.fish2);
        harfId=R.id.meem;
    }
    void setNoon(){
        harf.setText(getResources().getString(R.string.n));    //set harf
        object1.setText(getResources().getString(R.string.n1));
        object2.setText(getResources().getString(R.string.n2));
        img1.setImageResource(R.drawable.coco);
        img2.setImageResource(R.drawable.nalka);
        harfId=R.id.noon;
    }
    void setWao(){
        harf.setText(getResources().getString(R.string.w));    //set harf
        object1.setText(getResources().getString(R.string.w1));
        object2.setText(getResources().getString(R.string.w2));
        img1.setImageResource(R.drawable.lawyer);
        img2.setImageResource(R.drawable.wark);
        harfId=R.id.wao;
    }
    void setH(){
        harf.setText(getResources().getString(R.string.h));    //set harf
        object1.setText(getResources().getString(R.string.h1));
        object2.setText(getResources().getString(R.string.h2));
        img1.setImageResource(R.drawable.hathi);
        img2.setImageResource(R.drawable.hand);
        harfId=R.id.h;
    }
    void setHm(){
        harf.setText(getResources().getString(R.string.hm));    //set harf
        object1.setText(getResources().getString(R.string.hm1));
        object2.setText(getResources().getString(R.string.hm2));
        img1.setImageResource(R.drawable.tea);
        img2.setImageResource(R.drawable.mirror);
        harfId=R.id.hm;
    }

    void GoToNextPage(int harfId) {
        switch (harfId) {
            case R.id.alif:
                setAlifMad();
                break;
            case R.id.alifmad:
                setBay();
                break;
            case R.id.bay:
                setPay();
                break;
            case R.id.pay:
                setTy();
                break;
            case R.id.ty:
                setTay();
                break;
            case R.id.tay:
                setSay();
                break;
            case R.id.say:
                setJeem();
                break;
            case R.id.jeem:
                setChay();
                break;
            case R.id.chy:
                setHy();
                break;
            case R.id.hy:
                setKh();
                break;
            case R.id.kh:
                setDal();
                break;
            case R.id.dal:
                setDdal();
                break;
            case R.id.ddal:
                setZal();
                break;
            case R.id.zal:
                setRy();
                break;
            case R.id.ry:
                setArry();
                break;
            case R.id.arry:
                setZy();
                break;
            case R.id.zy:
                setYay();
                break;
            case R.id.yay:
                setSeen();
                break;
            case R.id.seen:
                setSheen();
                break;
            case R.id.sheen:
                setSuad();
                break;
            case R.id.suad:
                setZuad();
                break;
            case R.id.zuad:
                setToy();
                break;
            case R.id.toy:
                setZoy();
                break;
            case R.id.zoy:
                setAien();
                break;
            case R.id.aien:
                setGain();
                break;
            case R.id.gain:
                setFay();
                break;
            case R.id.fy:
                setQaf();
                break;
            case R.id.qaf:
                setKaf();
                break;
            case R.id.kaf:
                setGaf();
                break;
            case R.id.gaf:
                setLaam();
                break;
            case R.id.lam:
                setMeem();
                break;
            case R.id.meem:
                setNoon();
                break;
            case R.id.noon:
                setWao();
                break;
            case R.id.wao:
                setH();
                break;
            case R.id.h:
                setHm();
                break;
            case R.id.hm:
                setCyBy();
                break;
            case R.id.cy:
                setAlif();
                break;
            case R.id.by:
                setAlif();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + harfId);
        }
    }
    void GoToPreviousPage(int harfId) {
        switch (harfId) {
            case R.id.alif:
                setCyBy();
                break;
            case R.id.alifmad:
                setAlif();
                break;
            case R.id.bay:
                setAlifMad();
                break;
            case R.id.pay:
                setBay();
                break;
            case R.id.ty:
                setPay();
                break;
            case R.id.tay:
                setTy();
                break;
            case R.id.say:
                setTay();
                break;
            case R.id.jeem:
                setSay();
                break;
            case R.id.chy:
                setJeem();
                break;
            case R.id.hy:
                setChay();
                break;
            case R.id.kh:
                setHy();
                break;
            case R.id.dal:
                setKh();
                break;
            case R.id.ddal:
                setDal();
                break;
            case R.id.zal:
                setDdal();
                break;
            case R.id.ry:
                setZal();
                break;
            case R.id.arry:
                setRy();
                break;
            case R.id.zy:
                setArry();
                break;
            case R.id.yay:
                setZy();
                break;
            case R.id.seen:
                setYay();
                break;
            case R.id.sheen:
                setSeen();
                break;
            case R.id.suad:
                setSheen();
                break;
            case R.id.zuad:
                setSuad();
                break;
            case R.id.toy:
                setZuad();
                break;
            case R.id.zoy:
                setToy();
                break;
            case R.id.aien:
                setZoy();
                break;
            case R.id.gain:
                setAien();
                break;
            case R.id.fy:
                setGain();
                break;
            case R.id.qaf:
                setFay();
                break;
            case R.id.kaf:
                setQaf();
                break;
            case R.id.gaf:
                setKaf();
                break;
            case R.id.lam:
                setGaf();
                break;
            case R.id.meem:
                setLaam();
                break;
            case R.id.noon:
                setMeem();
                break;
            case R.id.wao:
                setNoon();
                break;
            case R.id.h:
                setWao();
                break;
            case R.id.hm:
                setH();
                break;
            case R.id.cy:
                setHm();
                break;
            case R.id.by:
                setHm();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + harfId);
        }
    }
    void SetResources(int harfId){
        /*String h="",n1="",n2="";
        int image1 = -1,image2 = -1;*/
        switch (harfId) {
            case R.id.alif:
                setAlif();
                break;
            case R.id.alifmad:
               setAlifMad();
                break;
            case R.id.bay:
                setBay();
                break;
            case R.id.pay:
                setPay();
                break;
            case R.id.ty:
                setTy();
                break;
            case R.id.tay:
               setTay();
                break;
            case R.id.say:
                setSay();
                break;
            case R.id.jeem:
                setJeem();
                break;
            case R.id.chy:
                setChay();
                break;
            case R.id.hy:
                setHy();
                break;
            case R.id.kh:
                setKh();
                break;
            case R.id.dal:
                setDal();
                break;
            case R.id.ddal:
                setDdal();
                break;
            case R.id.zal:
                setZal();
                break;
            case R.id.ry:
                setRy();
                break;
            case R.id.arry:
                setArry();
                break;
            case R.id.zy:
                setZy();
                break;
            case R.id.yay:
                setYay();
                break;
            case R.id.seen:
                setSeen();
                break;
            case R.id.sheen:
                setSheen();
                break;
            case R.id.suad:
                setSuad();
                break;
            case R.id.zuad:
                setZuad();
                break;
            case R.id.toy:
                setToy();
                break;
            case R.id.zoy:
                setZoy();
                break;
            case R.id.aien:
                setAien();
                break;
            case R.id.gain:
                setGain();
                break;
            case R.id.fy:
                setFay();
                break;
            case R.id.qaf:
                setQaf();
                break;
            case R.id.kaf:
                setKaf();
                break;
            case R.id.gaf:
                setGaf();
                break;
            case R.id.lam:
                setLaam();
                break;
            case R.id.meem:
                setMeem();
                break;
            case R.id.noon:
                setNoon();
                break;
            case R.id.wao:
                setWao();
                break;
            case R.id.h:
                setH();
                break;
            case R.id.hm:
                setHm();
                break;
            case R.id.cy:
                setCyBy();
                break;
            case R.id.by:
                setCyBy();
                break;
            default:
                throw new IllegalStateException("Unexpected value: "+harfId);

        }
    }
}