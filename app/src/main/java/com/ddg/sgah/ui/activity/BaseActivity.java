package com.ddg.sgah.ui.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.data.db.HomeListsData;
import com.ddg.sgah.helper.LanguageUtil;
import com.ddg.sgah.helper.SharedPreferenceManager;
import com.ddg.sgah.ui.fragments.AboutUsFragment;
import com.ddg.sgah.ui.fragments.ContactUsFragment;
import com.ddg.sgah.ui.fragments.EventsFragment;
import com.ddg.sgah.ui.fragments.HomeFragment;
import com.ddg.sgah.ui.fragments.MyCoursesFragment;
import com.ddg.sgah.ui.fragments.NewsFragment;
import com.ddg.sgah.ui.fragments.NotificationsFragment;
import com.ddg.sgah.ui.fragments.ProfileFragment;
import com.ddg.sgah.ui.fragments.StudyPlanFragment;

public class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private SharedPreferenceManager sharedPreferenceManager;
    private LanguageUtil languageUtil;
    private BottomNavigationView navigation;
    private DrawerLayout drawer;
    public static NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);


        init();
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
        View headerView = navigationView.getHeaderView(0);
        String userName1 = sharedPreferenceManager.loadUserName();
        if (userName1 != null) {
            if (userName1.equals("maryam")) {

                TextView userName = headerView.findViewById(R.id.header_userName);
                userName.setText("Maryam Al Roumi");
                TextView email = headerView.findViewById(R.id.header_email);
                email.setText("maryam.sgah.2019@gmail.com");
            } else {
                TextView userName = headerView.findViewById(R.id.header_userName);
                userName.setText("Nouf Al Rashed");
                TextView email = headerView.findViewById(R.id.header_email);
                email.setText("nouf.sgah.2019@gmail.com");


            }
        }

    }

    //open menu
    public void openDrawer(View view) {
        drawer.openDrawer(navigationView);
    }
        //open profile
    public void openProfile(View view) {
        loadFragment(new ProfileFragment());
    }



    private void init() {

        sharedPreferenceManager = new SharedPreferenceManager(BaseActivity.this);
        languageUtil = new LanguageUtil(BaseActivity.this);
        navigation = findViewById(R.id.home_bn_home_bottom_nav);
        //set listener to BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bse, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            loadFragment(new ProfileFragment());
        } else if (id == R.id.nav_myCourses) {
            HomeListsData.courses = true;
            loadFragment(new MyCoursesFragment());


        } else if (id == R.id.nav_events) {
            loadFragment(new EventsFragment());


        } else if (id == R.id.nav_aboutUs) {
            loadFragment(new AboutUsFragment());


        } else if (id == R.id.nav_news) {
            loadFragment(new NewsFragment());


        } else if (id == R.id.nav_notifications) {
            loadFragment(new NotificationsFragment());


        } else if (id == R.id.nav_language) {
            showLanguageDialog();

        } else if (id == R.id.nav_contactUs) {
            loadFragment(new ContactUsFragment());

        } else if (id == R.id.nav_shareApp) {
            setShareApp();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //SET FRAGMENT NAVIGATION
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.botm_nav_home:
                    loadFragment(new HomeFragment());

                    return true;
                case R.id.botm_nav_myCourses:
                    HomeListsData.courses = true;

                    loadFragment(new MyCoursesFragment());

                    return true;
                case R.id.botm_nav_events:

                    loadFragment(new EventsFragment());

                    return true;
                case R.id.botm_nav_studyPlane:
                    HomeListsData.courses = false;


                    loadFragment(new StudyPlanFragment());
                    return true;

            }
            return false;
        }
    };


    void showLanguageDialog() {
        final Dialog dialog = new Dialog(BaseActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_change_language);
        dialog.setCancelable(true);
        //  initialize dialog components
        LinearLayout dialogParent = dialog.findViewById(R.id.layout_dialog_parent);
        Button english = dialog.findViewById(R.id.btn_english);
        Button arabic = dialog.findViewById(R.id.btn_arabic);
        dialog.show();
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferenceManager.saveLanguage("en");
                languageUtil.setLocale("en");
                startActivity(new Intent(BaseActivity.this, BaseActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                fileList();

            }
        });
        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferenceManager.saveLanguage("ar");
                languageUtil.setLocale("ar");
                startActivity(new Intent(BaseActivity.this, BaseActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                fileList();
            }
        });


    }

    private void setShareApp() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));


    }


    // load fragment method to make transactions between fragments
    public void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.home_fl_activity_frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.commit();
    }


}
