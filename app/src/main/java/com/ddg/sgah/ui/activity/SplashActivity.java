package com.ddg.sgah.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ddg.sgah.R;
import com.ddg.sgah.data.db.UsersDb;
import com.ddg.sgah.helper.LanguageUtil;
import com.ddg.sgah.helper.SharedPreferenceManager;
import com.jaeger.library.StatusBarUtil;

import java.util.Locale;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        StatusBarUtil.setTransparent(SplashActivity.this);
        sharedPreferenceManager = new SharedPreferenceManager(SplashActivity.this);

        setAppLanguage();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sharedPreferenceManager.loadUserName()!=null){
                    startActivity(new Intent(SplashActivity.this, BaseActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();}else {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    finish();
                }
            }
        }, 3000);

    }

    private void setAppLanguage() {
        LanguageUtil languageUtil = new LanguageUtil(SplashActivity.this);
        if (sharedPreferenceManager.loadLanguage() != null) {

            languageUtil.setLocale(sharedPreferenceManager.loadLanguage());

        } else {
            String phoneLanguage = Locale.getDefault().getLanguage();

            languageUtil.setLocale(phoneLanguage);

        }

    }


}
