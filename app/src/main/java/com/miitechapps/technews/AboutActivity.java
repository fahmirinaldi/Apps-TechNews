package com.miitechapps.technews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        Button button = (Button)findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                String https;
                intent.setData(Uri.parse("https://www.instagram.com/fahmi_rinaldi/"));
                startActivity(intent);

            }
        });

        ImageView imageView = (ImageView)findViewById(R.id.mail);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                String mailto;
                intent.setData(Uri.parse("mailto: fahmi3012@gmail.com"));
                startActivity(intent);
            }
        });

        ImageView imageView1 = (ImageView)findViewById(R.id.phone);
        imageView1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                String https;
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=628979023149&text=Hello :)"));
                startActivity(intent);
            }
        }));

        ImageView imageView2 = (ImageView)findViewById(R.id.school);
        imageView2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                String http;
                intent.setData(Uri.parse("http://smk-dewantara.sch.id/"));
                startActivity(intent);
            }
        }));

        ImageView imageView3 = (ImageView)findViewById(R.id.maps);
        imageView3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                String https;
                intent.setData(Uri.parse("https://goo.gl/maps/tNJcSaU6ALbKt8in7"));
                startActivity(intent);
            }
        }));




    }
}
