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
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;
            case R.id.alif:
                h = getResources().getString(R.string.a);
                n1 = getResources().getString(R.string.a1);
                n2 = getResources().getString(R.string.a2);
                image1 = R.drawable.anar;
                image2 = R.drawable.angoor;
                break;


        }
        harf.setText(h);    //set harf
        object1.setText(n1);
        object2.setText(n2);
        img1.setImageResource(image1);
        img2.setImageResource(image2);
    }
}