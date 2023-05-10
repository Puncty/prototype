package com.puncty.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowMetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_metings);

        Meeting[] meetings = new Meeting[10];
        meetings[0] = new Meeting("Wurzach", 29, 2, 14, 30);
        meetings[1] = new Meeting("Ravensburg", 4, 1, 15, 00);
        meetings[2] = new Meeting("Weingarten", 15, 3, 14, 45);
        meetings[3] = new Meeting("",0,0,0,0);
        meetings[4] = new Meeting("",0,0,0,0);
        meetings[5] = new Meeting("",0,0,0,0);
        meetings[6] = new Meeting("",0,0,0,0);
        meetings[7] = new Meeting("",0,0,0,0);
        meetings[8] = new Meeting("",0,0,0,0);
        meetings[9] = new Meeting("",0,0,0,0);


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(this, meetings);
        recyclerView.setAdapter(adapter);

    }
}

