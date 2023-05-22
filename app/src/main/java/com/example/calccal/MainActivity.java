package com.example.calccal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btn;
    private RecyclerView recview;
    private ArrayList<weeks> weeks = new ArrayList<weeks>();
    final String ATTRIBUTE_NAME_TEXT = "text";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview = findViewById(R.id.recview);
        weeksAdapter weeksadapter = new weeksAdapter(this, weeks);
        recview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recview.setAdapter(weeksadapter);
        btn = (FloatingActionButton) findViewById(R.id.Btn);
        initializeData();
    }
    private void initializeData() {
        weeks.add(new weeks(1));
        weeks.add(new weeks(2));
        weeks.add(new weeks(3));

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                btn.setOnClickListener(this);
                weeks.add(new weeks(weeks.size() + 1));
                recview.getAdapter().notifyItemInserted(weeks.size() - 1);
            }
        });

    }


}
