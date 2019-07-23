package com.ddg.sgah.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.ddg.sgah.R;
import com.ddg.sgah.data.db.UsersDb;
import com.ddg.sgah.data.model.Users;
import com.ddg.sgah.helper.SharedPreferenceManager;
import com.ddg.sgah.helper.Validation;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {


    EditText edtUserEmail;
    EditText edtPassword;


    @BindView(R.id.edt_PasswordLayout)
    TextInputLayout edtPasswordLayout;
    @BindView(R.id.img_Signin)
    Button imgSignin;
    @BindView(R.id.txt_ForgotPassword)
    TextView txtForgotPassword;
    @BindView(R.id.txt_dontHaveAccount)
    TextView txtDontHaveAccount;
    @BindView(R.id.txt_signUp)
    TextView txtSignUp;
    @BindView(R.id.sv_signInParent)
    ScrollView svSignInParent;
    private Validation validation;
    private SharedPreferenceManager sharedPreferenceManager;
    private boolean error = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(LoginActivity.this);
        validation = new Validation(LoginActivity.this);
        edtUserEmail = findViewById(R.id.edt_UserEmail);
        edtPassword = findViewById(R.id.edt_Password);
        sharedPreferenceManager = new SharedPreferenceManager(LoginActivity.this);

//        StatusBarUtil.setTransparent(LoginActivity.this);

    }

    public void gotoSignUp(View view) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

    public void login(View view) {
        validation();


    }

    public void validation() {


        if ((validation.setEmailValidation2(edtUserEmail)) && (validation.setPasswordValidation(edtPassword))) {
            String password = edtPassword.getText().toString();
            String edtuserName = edtUserEmail.getText().toString();

            List<Users> userName = UsersDb.getUserName();
            if (UsersDb.getUserName() != null && UsersDb.getUserName().size() > 0) {
                for (int i = 0; i < userName.size(); i++) {
                    String email = userName.get(i).getEmail();
                    String password1 = userName.get(i).getPassword();
                    if (email.equals(edtuserName) && password1.equals(password)) {
                        if (edtuserName.equals("nouf.sgah.2019@gmail.com")) {
                            UsersDb.userName = "nouf";
                            sharedPreferenceManager.saveUserName("nouf");

                            startActivity(new Intent(LoginActivity.this, BaseActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                            finish();
                        } else if (edtuserName.equals("maryam.sgah.2019@gmail.com")) {
                            sharedPreferenceManager.saveUserName("maryam");

                            UsersDb.userName = "maryam";

                            startActivity(new Intent(LoginActivity.this, BaseActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                            finish();

                        } else if (edtuserName.equals("admin.sgah.2019@gmail.com")) {

                            sharedPreferenceManager.saveUserName("admin");

                            UsersDb.userName = "admin";


                            startActivity(new Intent(LoginActivity.this, AdminActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                            finish();
                        }


                        error = false;

                        break;
                    }
                }


            }
            if (error) {
                Toast.makeText(this, getString(R.string.loginError), Toast.LENGTH_LONG).show();

            }

        }


    }
}
