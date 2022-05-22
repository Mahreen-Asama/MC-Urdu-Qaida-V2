package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button haroof[] =new Button[40];    //38 haroof, 2 extra btns

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        haroof[0]=findViewById(R.id.alif);
        haroof[1]=findViewById(R.id.alifmad);
        haroof[2]=findViewById(R.id.bay);
        haroof[3]=findViewById(R.id.pay);
        haroof[4]=findViewById(R.id.ty);
        haroof[5]=findViewById(R.id.tay);
        haroof[6]=findViewById(R.id.say);
        haroof[7]=findViewById(R.id.jeem);
        haroof[8]=findViewById(R.id.chy);
        haroof[9]=findViewById(R.id.hy);
        haroof[10]=findViewById(R.id.kh);
        haroof[11]=findViewById(R.id.dal);
        haroof[12]=findViewById(R.id.ddal);
        haroof[13]=findViewById(R.id.zal);
        haroof[14]=findViewById(R.id.ry);
        haroof[15]=findViewById(R.id.arry);
        haroof[16]=findViewById(R.id.zy);
        haroof[17]=findViewById(R.id.yay);
        haroof[18]=findViewById(R.id.seen);
        haroof[19]=findViewById(R.id.sheen);
        haroof[20]=findViewById(R.id.suad);
        haroof[21]=findViewById(R.id.zuad);
        haroof[22]=findViewById(R.id.toy);
        haroof[23]=findViewById(R.id.zoy);
        haroof[24]=findViewById(R.id.aien);
        haroof[25]=findViewById(R.id.gain);
        haroof[26]=findViewById(R.id.fy);
        haroof[27]=findViewById(R.id.qaf);
        haroof[28]=findViewById(R.id.kaf);
        haroof[29]=findViewById(R.id.gaf);
        haroof[30]=findViewById(R.id.lam);
        haroof[31]=findViewById(R.id.meem);
        haroof[32]=findViewById(R.id.noon);
        haroof[33]=findViewById(R.id.wao);
        haroof[34]=findViewById(R.id.h);
        haroof[35]=findViewById(R.id.btn_share_page);
        haroof[36]=findViewById(R.id.hm);
        haroof[37]=findViewById(R.id.cy);
        haroof[38]=findViewById(R.id.by);
        haroof[39]=findViewById(R.id.btn_back_page);

        for(int i=0; i<40; i++){
            haroof[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_back_page:
                Intent intentBack=new Intent(this,ChoiceActivity.class); //explicit intent
                startActivity(intentBack);
                break;
            case R.id.btn_share_page:
                Intent intentShare=new Intent(Intent.ACTION_SEND); //implicit intent
                startActivity(intentShare);
                break;
            default:
                Button btnHarf=(Button)view;

                String harfText=btnHarf.getText().toString();   //got text of btn
                int color=((ColorDrawable)btnHarf.getBackground()).getColor(); //get background color of btn

                Intent intentPage=new Intent(this,ImageViewActivity.class); //go to next activity

                //intentPage.putExtra("harfText",harfText);   //put data
                //intentPage.putExtra("harfColor",String.format("#%06X",(0xFFFFFF) & color));

                intentPage.putExtra("harfId", btnHarf.getId());   //put data
                intentPage.putExtra("harfColor", color);

                startActivity(intentPage);
                break;
        }
    }
}