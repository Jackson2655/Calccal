package com.example.calccal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recview;
    private ArrayList<weeks> weeks = new ArrayList<weeks>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeData();
        recview = findViewById(R.id.recview);
        weeksAdapter weeksadapter = new weeksAdapter(this, weeks);
        recview.setLayoutManager(new LinearLayoutManager(this));
        recview.setAdapter(weeksadapter);
    }
    private void initializeData() {
        weeks.add(new weeks(1));
        weeks.add(new weeks(2));
        weeks.add(new weeks(3));
        weeks.add(new weeks(4));
        weeks.add(new weeks(5));
        weeks.add(new weeks(6));
        weeks.add(new weeks(7));

    }
}
