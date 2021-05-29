package phuonganh.com.example.titama.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;
import java.util.Date;

import phuonganh.com.example.titama.R;
import phuonganh.com.example.titama.time.CustomDateTimePicker;


public class AddTaskActivity extends AppCompatActivity {

    CustomDateTimePicker custom;
    private EditText startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        startTime = (EditText) findViewById(R.id.startTime);
        custom = new CustomDateTimePicker(this, new CustomDateTimePicker.ICustomDateTimeListener() {

                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onSet(Dialog dialog, Calendar calendarSelected,
                                      Date dateSelected, int year, String monthFullName,
                                      String monthShortName, int monthNumber, int day,
                                      String weekDayFullName, String weekDayShortName,
                                      int hour24, int hour12, int min, int sec,
                                      String AM_PM) {
                        startTime.setText("Start     " + calendarSelected.get(Calendar.DAY_OF_MONTH) + "-" + (monthNumber + 1) + "-"  + year + "   " + hour24 + ":" + min);
                    }

                    @Override
                    public void onCancel() {
//                        Toast.makeText("Date and time selection canceled!!!", this, Toast.LENGTH_SHORT).show();
                    }
                });
        /**
         * Pass Directly current time format it will return AM and PM if you set
         * false
         */
        custom.set24HourFormat(true);
        /**
         * Pass Directly current data and time to show when it pop up
         */
        custom.setDate(Calendar.getInstance());
        startTime.setOnClickListener(v -> custom.showDialog());
    }
}

