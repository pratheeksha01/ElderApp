package com.example.gridtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity implements ExampleDialog.ExampleDialogListener{
    private TextView textViewUsername;
    // private TextView textViewPassword;
    private Button button;
    public int total=8;
    public  int alreadydrank;
    public static final String SHARED_PREFS="sharedPrefs";
   public static final String TEXT="text";
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        textViewUsername = (TextView) findViewById(R.id.textview_username);
        //textViewPassword = (TextView) findViewById(R.id.textview_password);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

    }




    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
    @Override
    public void applyTexts(String username) {
        PrefConfig.saveTotalInPref(getApplicationContext(),alreadydrank);
        alreadydrank=PrefConfig.loadTotalFromPref(this);
        Integer dranknw=Integer.parseInt(username);
        alreadydrank=alreadydrank+dranknw;

        Integer goal=total-alreadydrank;

        textViewUsername.setText("your goal is"+goal);
        //textViewPassword.setText("your goal");
    }
    }

