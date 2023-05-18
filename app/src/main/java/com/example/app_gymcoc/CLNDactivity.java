package com.example.app_gymcoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class CLNDactivity extends AppCompatActivity {

    CalendarView calender_View;
    TextView text_Calender;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clndactivity);

        calender_View = findViewById(R.id.calendar);
        text_Calender = findViewById(R.id.text_calender);

        calender_View.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                String date = 12 +"/"+month+"/"+dayOfMonth;
                text_Calender.setText(date);


            }
        });

    }
}