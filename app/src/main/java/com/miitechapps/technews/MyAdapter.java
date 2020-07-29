package com.miitechapps.technews;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] data1;
    private String[] data2;
    private int[] images;
    private String [] deskripsi;
    private String [] display;
    private String [] size;
    private String [] battery;
    private Context context;

    MyAdapter(Context ct, String[] s1, String[] s2, String [] des,String [] dis,String [] si,String [] bat,int[] img){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
        deskripsi = des;
        display = dis;
        size = si;
        battery = bat;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_row_hp, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImageView.setImageResource(images[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (context, DetailActivity.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("myImageView",images[position]);
                intent.putExtra("deskripsi", deskripsi[position]);
                intent.putExtra("display", display[position]);
                intent.putExtra("size", size[position]);
                intent.putExtra("battery", battery[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myText1,myText2;
        ImageView myImageView;
        ConstraintLayout mainLayout;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myText2 = itemView.findViewById(R.id.myText2);
            myImageView = itemView.findViewById(R.id.myImageView);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}