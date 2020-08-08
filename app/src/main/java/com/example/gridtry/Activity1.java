package com.example.gridtry;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Activity1 extends AppCompatActivity {
    EditText pillname;
    Button set,cancel;
    private int  notifiedId = 1;
    TimePicker tp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        pillname=(EditText)findViewById(R.id.et1);
        set=(Button)findViewById(R.id.btn1);
        cancel=(Button)findViewById(R.id.btn2);
        tp=(TimePicker)findViewById(R.id.tp1);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Activity1.this,AlarmReciever.class);
                i.putExtra("notifiedId",notifiedId);
                i.putExtra("pillname",pillname.getText().toString());

                //  PendingIntent alarmintent= new PendingIntent.getBroadcast(MainActivity.this,0,i,PendingIntent.FLAG_CANCEL_CURRENT);
                PendingIntent alarmIntent = PendingIntent.getBroadcast(Activity1.this, 0,
                        i, PendingIntent.FLAG_CANCEL_CURRENT);

                AlarmManager alarm = (AlarmManager) getSystemService(ALARM_SERVICE);

                switch (v.getId()){
                    case R.id.btn1:
                        int hour = tp.getHour();
                        int min = tp.getMinute();
                        // tp.is24HourView(true);

                        Calendar st= Calendar.getInstance();
                        st.set(Calendar.HOUR_OF_DAY,hour);
                        st.set(Calendar.MINUTE,min);
                        st.set(Calendar.SECOND,0);
                        long alarmStartTime=st.getTimeInMillis();

                        alarm.set(AlarmManager.RTC_WAKEUP,alarmStartTime,alarmIntent);
                        Toast.makeText(Activity1.this, "done", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.btn2:
                        alarm.cancel(alarmIntent);
                        Toast.makeText(Activity1.this, "cancelled", Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

    }
}
