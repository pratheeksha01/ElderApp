package com.example.gridtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
      ImageButton ibtn1,ibtn2,ibtn3,ibtn4,ibtn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibtn1=(ImageButton)findViewById(R.id.btn1);
        ibtn2=(ImageButton)findViewById(R.id.btn2);
        ibtn3=(ImageButton)findViewById(R.id.btn3);
        ibtn4=(ImageButton)findViewById(R.id.btn4);
        ibtn5=(ImageButton)findViewById(R.id.btn5);

        ibtn1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i=new Intent(MainActivity.this,Activity1.class);
                                         startActivity(i);
                                         //finish();
                                     }
                                 }

        );
        ibtn2.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i=new Intent(MainActivity.this,Activity3.class);
                                         startActivity(i);
                                         //finish();
                                     }
                                 }

        );
        ibtn3.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i=new Intent(MainActivity.this,Activity2.class);
                                         startActivity(i);
                                         //finish();
                                     }
                                 }

        );
        ibtn4.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i=new Intent(MainActivity.this,Activity4.class);
                                         startActivity(i);
                                        // finish();
                                     }
                                 }

        );
        ibtn5.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i=new Intent(MainActivity.this,Activity5.class);
                                         startActivity(i);
                                         // finish();
                                     }
                                 }

        );




    }
}
