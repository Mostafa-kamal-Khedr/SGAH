package com.ddg.sgah.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.adapter.AdminFilesAdapter;
import com.ddg.sgah.data.db.HomeListsData;
import com.ddg.sgah.data.model.HomeListModel;
import com.ddg.sgah.helper.SharedPreferenceManager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdminActivity extends AppCompatActivity {

    @BindView(R.id.rc_admin)
    RecyclerView rcAdmin;
    private SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        ButterKnife.bind(this);

        inflateAppBar();
        rcAdmin.setLayoutManager(new LinearLayoutManager(AdminActivity.this,
                LinearLayout.VERTICAL, false));
        List<HomeListModel> filesCourses = HomeListsData.getFilesCourses();
        rcAdmin.setAdapter(new AdminFilesAdapter(filesCourses, AdminActivity.this));
        sharedPreferenceManager = new SharedPreferenceManager(AdminActivity.this);


    }


    private void inflateAppBar() {

        //      start of  inflate appBar layout
        Toolbar customToolbar = findViewById(R.id.custom_toolbar);
        setSupportActionBar(customToolbar);
        TextView aboutUserAppBarTitle = findViewById(R.id.appbar_title);
        aboutUserAppBarTitle.setText(R.string.theContent);
        ImageView upload = findViewById(R.id.iv_upload);
        upload.setVisibility(View.VISIBLE);
        ImageView exit = findViewById(R.id.iv_Exit);
        exit.setVisibility(View.VISIBLE);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminActivity.this, UploadActivity.class));


            }
        });


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferenceManager.removeUserSession();
                startActivity(new Intent(AdminActivity.this, LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                finish();
            }
        });

    }

}

