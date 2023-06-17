package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Students> studentList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hello

        Students s1=new Students(1,"Ali");
        Students s2=new Students(1,"Ali2");
        Students s3=new Students(1,"Ali3");
        Students s4=new Students(1,"Ali4");
        Students s5=new Students(1,"Ali5");
        Students s6=new Students(1,"Ali5");


        studentList.addAll(Arrays.asList(new Students[]{s1,s2,s3,s4,s5,s6}));
        recyclerView = findViewById(R.id.recylerViewStudent);


        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(MainActivity.this);
//        layoutManager = new LinearLayoutManager(MainActivity.this,
//                LinearLayoutManager.HORIZONTAL,
//                false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(this,studentList) ;
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();

    }
}




