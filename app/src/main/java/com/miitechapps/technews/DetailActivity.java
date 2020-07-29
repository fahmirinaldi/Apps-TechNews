package com.miitechapps.technews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView ivHP;
    TextView HargaHP,NamaHP, DeskripsiHP, DisplayHP, SizeHP, BatteryHP;

    String data1,data2,deskripsi, display, size, battery;
    int myImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button button = findViewById(R.id.btn_follow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/fahmi_rinaldi/"));
                startActivity(intent);

            }
        });

        ivHP = findViewById(R.id.ivHP);
        HargaHP = findViewById(R.id.HargaHP);
        NamaHP = findViewById(R.id.NamaHP);
        DeskripsiHP = findViewById(R.id.DeskripsiHP);
        DisplayHP = findViewById(R.id.DisplayHP);
        SizeHP = findViewById(R.id.SizeHP);
        BatteryHP = findViewById(R.id.BatteryHP);

        getData();
        setData();
    }

    private void getData() {
        if (getIntent().hasExtra("myImageView") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2") && getIntent().hasExtra("deskripsi") && getIntent().hasExtra("display") && getIntent().hasExtra("size") && getIntent().hasExtra("battery")) {

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImageView = getIntent().getIntExtra("myImageView", 1);
            deskripsi = getIntent().getStringExtra("deskripsi");
            display = getIntent().getStringExtra("display");
            size = getIntent().getStringExtra("size");
            battery = getIntent().getStringExtra("battery");

        }else {
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        NamaHP.setText(data1);
        HargaHP.setText(data2);
        ivHP.setImageResource(myImageView);
        DeskripsiHP.setText(deskripsi);
        DisplayHP.setText(display);
        SizeHP.setText(size);
        BatteryHP.setText(battery);
    }

}
