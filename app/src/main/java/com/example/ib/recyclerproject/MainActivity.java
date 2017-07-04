package com.example.ib.recyclerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        DataModel itemsData[] = {
                new DataModel("Texte 1", R.drawable.a1),
                new DataModel("Texte 2", R.drawable.a2),
                new DataModel("Texte 3", R.drawable.a3),
                new DataModel("Texte 4", R.drawable.a4),
                new DataModel("Texte 5", R.drawable.a5),
                new DataModel("Texte 6", R.drawable.a6),
                new DataModel("Texte 7", R.drawable.a7),
                new DataModel("Texte 8", R.drawable.a8),
                new DataModel("Texte 9", R.drawable.a9),
                new DataModel("Texte 10", R.drawable.a10),
        };

        RecyclerAdapter adapter = new RecyclerAdapter(itemsData);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
