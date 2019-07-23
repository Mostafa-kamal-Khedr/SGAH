package com.ddg.sgah.helper;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

import com.ddg.sgah.R;


/**
 * Created by Mostafa khedr on 02,1,2018
 */


public class Validation {
    public static String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static String userNamePattern = "^[a-zA-Z0-9](_(?!(\\.|_))|\\.(?!(_|\\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$";

    Context context;

    public Validation(Context context) {
        this.context = context;
    }


    //  this method to validate any editText for not null
    public boolean setEmptyValidation(EditText EditText) {

        String text = EditText.getText().toString();

        if (TextUtils.isEmpty(text)) {
            EditText.setError(context.getResources().getString(R.string.empity));
            EditText.requestFocus();
            return false;
        } else {

            return true;
        }


    }


    //  this method to validate any editText for not null
    public boolean setEmptyValidation(EditText EditText, int emptyValue) {

        String text = EditText.getText().toString();

        if (TextUtils.isEmpty(text)) {
            EditText.setError(context.getResources().getString(emptyValue));
            EditText.requestFocus();
            return false;
        } else {

            return true;
        }


    }


    // this method validate  user name
    public boolean setUserNameValidation(EditText textInputLayout) {
        String userName = textInputLayout.getText().toString();


        if (TextUtils.isEmpty(userName)) {
            textInputLayout.setError(context.getResources().getString(R.string.EnterNamge));

            textInputLayout.requestFocus();
            return false;
        }  else if (userName.length() < 3) {
            textInputLayout.setError(context.getResources().getString(R.string.userNameLength));
            textInputLayout.requestFocus();
            return false;
        }
        textInputLayout.setError(null);

        return true;

    }  // this method validate  user name

    public boolean setUserNameValidation(EditText textInputLayout, TextInputLayout layout) {
        String userName = textInputLayout.getText().toString();


        if (TextUtils.isEmpty(userName)) {
            layout.setError(context.getResources().getString(R.string.EnterNamge));

            layout.requestFocus();
            return false;
        } else if (userName.contains(" ")) {
            layout.setError(context.getResources().getString(R.string.spaceValidation));

            layout.requestFocus();
            return false;
        } else if (userName.length() < 3) {
            layout.setError(context.getResources().getString(R.string.userNameLength));
            layout.requestFocus();
            return false;
        }
        layout.setError(null);

        return true;

    }  // this method validate  user name

    // this method validate  password
    public boolean setPasswordValidation(EditText textInputLayout) {
        String password = textInputLayout.getText().toString();

        if (TextUtils.isEmpty(password)) {
            textInputLayout.setError(context.getResources().getString(R.string.EnterPass));

            textInputLayout.requestFocus();
            return false;

        } else if (password.length() < 8) {
            textInputLayout.setError(context.getResources().getString(R.string.shortPass));
            textInputLayout.requestFocus();
            return false;

        } else {
            textInputLayout.setError(null);

            return true;
        }

    }

    public boolean setEmailValidation2(EditText EmailEditText) {
        String email = EmailEditText.getText().toString();


        if (TextUtils.isEmpty(email)) {
            EmailEditText.setError(context.getResources().getString(R.string.EnterEmail));
            EmailEditText.requestFocus();
            return false;
        } else if (!email.matches(emailPattern)) {
            EmailEditText.setError(context.getResources().getString(R.string.invalidEmail));
            EmailEditText.requestFocus();
            return false;
        } else {
            EmailEditText.setError(null);

            return true;
        }

    }

}
