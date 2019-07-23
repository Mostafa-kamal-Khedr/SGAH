package com.ddg.sgah.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ddg.sgah.R;
import com.ddg.sgah.ui.fragments.course.ContentsFragment;
import com.ddg.sgah.ui.fragments.course.GradesFragment;
import com.ddg.sgah.ui.fragments.course.ParticipentsFragment;
import com.jaeger.library.StatusBarUtil;

public class CourseContent extends AppCompatActivity {
    Fragment fragment[] = {new ContentsFragment(), new ParticipentsFragment(), new GradesFragment()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_content);
        inflatePagerAdapter();
    }

    private void inflatePagerAdapter() {
        MyReservationPagerAdapter adepter = new MyReservationPagerAdapter(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(adepter);
        tabLayout.setupWithViewPager(pager);
        StatusBarUtil.setTransparent(CourseContent.this);


    }

    public class MyReservationPagerAdapter extends FragmentPagerAdapter {


        public MyReservationPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {


            return fragment[position];
        }

        @Override
        public int getCount() {
            return fragment.length;
        }


        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:

                    return getResources().getString(R.string.content);
                case 1:
                    return getResources().getString(R.string.participants);
                case 2:
                    return getResources().getString(R.string.grades);

            }
            return null;

        }


    }
}
