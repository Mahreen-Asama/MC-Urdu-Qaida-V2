package com.example.urduqaidav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageViewActivity extends AppCompatActivity {

    TextView harf,object1,object2;
    ImageView img1,img2;
    Button next,prev;

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
    }
}