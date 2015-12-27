package com.example.kimhuang.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ItemAdapter adapter;
    List<Items> itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialViews();

        setupViews();

    }


    private void initialViews() {
        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewGame);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    }

    private void setupViews() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

         itemsList = new ArrayList<>();

        for(int i=0; i<15; i++){
            Items items = new Items("Kimhuang","" + i);

            itemsList.add(items);

        }
        adapter = new ItemAdapter(itemsList);
        recyclerView.setAdapter(adapter);
    }
}
