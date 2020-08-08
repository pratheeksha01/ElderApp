package com.example.gridtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Activity4 extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        recyclerView=findViewById(R.id.recyclerview);

        Integer[] langLogo={R.drawable.helpline,R.drawable.diet1,R.drawable.diet2,R.drawable.diet3};

        String[] langName={"Call For Help","Exercise","DietTip","NutritionTip"};

        mainModels = new ArrayList<>();
        for(int i=0;i<langLogo.length;i++)
        {
            MainModel model = new MainModel(langLogo[i],langName[i]);
            mainModels.add(model);

        }
        LinearLayoutManager layoutManager=new LinearLayoutManager(Activity4.this,LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Intialize Mian adapter
        mainAdapter=new MainAdapter(Activity4.this,mainModels);

        //set Main adapter to recycler view
        recyclerView.setAdapter(mainAdapter);


    }
}
