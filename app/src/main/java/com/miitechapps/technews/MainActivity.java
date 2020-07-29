package com.miitechapps.technews;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] des;
    String[] bat;
    String[] si;
    String [] dis;
    String[] s1;
    String[] s2;
    int[] images = {R.drawable.note8pro_hijau,R.drawable.note7_biru,R.drawable.a51biru,R.drawable.a50,R.drawable.s20,R.drawable.iphone11h,R.drawable.xsmax,R.drawable.iphonexr,R.drawable.zen6,R.drawable.findx,R.drawable.z1proh,R.drawable.v19,R.drawable.huawei};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.nama_hp);
        s2 = getResources().getStringArray(R.array.harga_hp);
        des = getResources().getStringArray(R.array.deskripsi);
        dis = getResources().getStringArray(R.array.display);
        si = getResources().getStringArray(R.array.size);
        bat = getResources().getStringArray(R.array.battery);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,des,dis,si,bat,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        MenuItem menuItem = menu.findItem(R.id.action_search);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.setting) {
            Intent i = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(i);
            return true;
        }
        else
        if (id == R.id.help) {
            Intent i = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(i);
            return true;
        }
        else
        if (id == R.id.action_about) {
            Intent i = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(i);
            return true;
        }
        else
        if (id == R.id.Terms) {
            Intent i = new Intent(MainActivity.this, TermsActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
