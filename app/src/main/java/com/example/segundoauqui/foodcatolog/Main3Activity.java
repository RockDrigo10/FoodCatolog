package com.example.segundoauqui.foodcatolog;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.segundoauqui.foodcatolog.model.Groceries;
import com.example.segundoauqui.foodcatolog.model.SelectedItems;
import com.example.segundoauqui.foodcatolog.view.mainview.MainView;
import com.example.segundoauqui.foodcatolog.view.mainview.RVISAdapter;
import com.example.segundoauqui.foodcatolog.view.mainview.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RVISAdapter adapter;
    LinearLayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    List<SelectedItems> result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView = (RecyclerView) findViewById(R.id.selectedRecycler);
        result = new ArrayList<>();
        result = getIntent().getParcelableArrayListExtra("check");
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RVISAdapter(result);
        recyclerView.setAdapter(adapter);


    }
}
