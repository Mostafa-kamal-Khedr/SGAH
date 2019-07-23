package com.ddg.sgah.ui.activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.data.db.UsersDb;
import com.ddg.sgah.data.model.Users;
import com.ddg.sgah.helper.DatePickerDialog;
import com.ddg.sgah.helper.Validation;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity {

    /*    @BindView(R.id.sp_speciality)
        Spinner spSpeciality;
        @BindView(R.id.sp_class)
        Spinner spGrade;*/
    @BindView(R.id.img_Signin)
    Button imgSignin;
    @BindView(R.id.edt_userName)
    EditText edtUserName;
    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.edt_password)
    EditText edtPassword;

    private Spinner spSpeciality;
    private Validation validation;
    private String speciality;
    private static String datePickerBundleKey = "datePickerBundleKey";
    public static TextView edtBirthdate;
    public static TextView edtJoiningDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        StatusBarUtil.setTransparent(SignUpActivity.this);
        ButterKnife.bind(this);
        validation = new Validation(SignUpActivity.this);

        init();
        // Spinner Drop down elements
        setSpecialitySpinner();


    }

    private void init() {
        spSpeciality = findViewById(R.id.sp_speciality);
        edtBirthdate = findViewById(R.id.edt_birthdate);
        edtJoiningDate = findViewById(R.id.edt_joiningDate);
        spSpeciality = findViewById(R.id.sp_speciality);
    }


    private void setSpecialitySpinner() {

        String[] specialityList = getResources().getStringArray(R.array.speciality);
        // Creating adapter for spinner
        ArrayAdapter<String> specialityAdapter = new ArrayAdapter<String>(SignUpActivity.this, R.layout.item_spinner, specialityList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView) v.findViewById(android.R.id.text1)).setText("select your speciality");
                    ((TextView) v.findViewById(android.R.id.text1)).setHint(getItem(getCount())); //"Hint to be displayed"
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount() - 1; // you dont display last item. It is used as hint.
            }

        };

        // Drop down layout style - list view with radio button
        specialityAdapter.setDropDownViewResource(R.layout.drpdn_qual);


        // attaching data adapter to spinner
        spSpeciality.setAdapter(specialityAdapter);
        spSpeciality.setSelection(specialityAdapter.getCount()); //set the hint the default selection so it appears on launch.


        spSpeciality.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // On selecting a spinner item
                speciality = parent.getItemAtPosition(position).toString();
                if (position > 0) {
                    // Showing selected spinner item
//                    Toast.makeText(parent.getContext(), "Selected: " + Speciality, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    public void gotToHome(View view) {

        validation();
    }


    public void validation() {


        if ((validation.setUserNameValidation(edtUserName)) && (validation.setEmailValidation2(edtEmail)) && (validation.setPasswordValidation(edtPassword))) {
            String email = edtEmail.getText().toString();
            String password = edtPassword.getText().toString();
            String edtuserName = edtUserName.getText().toString();
            List<Users> userName = UsersDb.getUserName();

            UsersDb.saveUserName(new Users(edtuserName, password, email, speciality, ""));

            startActivity(new Intent(SignUpActivity.this, BaseActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
            finish();
        }


    }

    public void openBirthDateDialog(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(datePickerBundleKey, "openBirthDateDialog");

        //set FragmentClass Arguments
        DialogFragment dialogfragment = new DatePickerDialog();
        dialogfragment.setArguments(bundle);
        dialogfragment.show(getFragmentManager(), "datePickerDialog");

    }

    public void openJoinDateDialog(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(datePickerBundleKey, "openJoinDateDialog");

        //set FragmentClass Arguments
        DialogFragment dialogfragment = new DatePickerDialog();
        dialogfragment.setArguments(bundle);
        dialogfragment.show(getFragmentManager(), "datePickerDialog");
    }
}
