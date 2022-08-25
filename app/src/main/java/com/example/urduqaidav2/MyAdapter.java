package com.example.urduqaidav2;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter{

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<QuizQuestion> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        QuizQuestion qnumber=getItem(position);

        convertView= LayoutInflater.from(getContext()).inflate(R.layout.questions_customized_list,parent,false);

        TextView swalNumber=convertView.findViewById(R.id.swal_number);
        ImageView img=convertView.findViewById(R.id.album_sign);

        swalNumber.setText(qnumber.getName());     //write name of student in relevent field
        img.setImageResource(stu.getImage());

        //just to check which item is clicking


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getContext(),QuizActivity.class);  //start quiz activity
                startActivity(getContext(),intent, Bundle.EMPTY);
            }
        });

        return  convertView;
    }
}
