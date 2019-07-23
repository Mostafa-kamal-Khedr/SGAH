package com.ddg.sgah.helper;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import com.ddg.sgah.ui.activity.SignUpActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mostafa kamal khedr on 31,December,2018
 */
public class DatePickerDialog extends DialogFragment implements android.app.DatePickerDialog.OnDateSetListener {
    public static String datePickerBundleKey = "datePickerBundleKey";
    private static String timePickerBundleKey = "timePickerBundleKey";
    private android.app.DatePickerDialog datePickerDialog;
    private int mHour;
    private int mMinute;
    String dateFormat = "dd/MM/yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
    private Calendar calendar;
    private Date date;
    private String format;
    private int currentYear;
    public static boolean error;
    private int currentDay;
    private int currentMonth;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        calendar = Calendar.getInstance();
        currentYear = calendar.get(Calendar.YEAR);
        currentMonth = calendar.get(Calendar.MONTH);
        currentDay = calendar.get(Calendar.DAY_OF_MONTH);


//        String datePickerArgumentResult = getArguments().getString(datePickerBundleKey);


        datePickerDialog = new android.app.DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, this, currentYear, currentMonth, currentDay);


        return datePickerDialog;


    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        String dateString = dateFormat.format(calendar.getTime());


        String datePickerArgumentResult = getArguments().getString(datePickerBundleKey);

        switch (datePickerArgumentResult) {

            case "openBirthDateDialog":
                SignUpActivity.edtBirthdate.setText(dateString);
                SignUpActivity.edtBirthdate.setError(null);
                break;
            case "openJoinDateDialog":
                SignUpActivity.edtJoiningDate.setText(dateString);
                SignUpActivity.edtJoiningDate.setError(null);
                break;


        }


    }


}
