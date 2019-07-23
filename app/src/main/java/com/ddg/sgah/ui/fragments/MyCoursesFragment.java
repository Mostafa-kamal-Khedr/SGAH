package com.ddg.sgah.ui.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ddg.sgah.R;
import com.ddg.sgah.ui.fragments.myCourses.AllFragment;
import com.ddg.sgah.ui.fragments.myCourses.FifthSemesterFragment;
import com.ddg.sgah.ui.fragments.myCourses.FirstSemesterFragment;
import com.ddg.sgah.ui.fragments.myCourses.FourthSemesterFragment;
import com.ddg.sgah.ui.fragments.myCourses.SecondFragment;
import com.ddg.sgah.ui.fragments.myCourses.ThirdSemesterFragment;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyCoursesFragment extends Fragment {

    Fragment fragment[] = {new AllFragment(), new FirstSemesterFragment(), new SecondFragment(), new ThirdSemesterFragment(), new FourthSemesterFragment(), new FifthSemesterFragment()};

    public MyCoursesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflate = inflater.inflate(R.layout.fragment_my_courses, container, false);

        ButterKnife.bind(this, inflate);


        inflatePagerAdapter(inflate);
        return inflate;


    }

    private void inflatePagerAdapter(View inflate) {
        MyReservationPagerAdapter adepter = new MyReservationPagerAdapter(getChildFragmentManager());
        TabLayout tabLayout = inflate.findViewById(R.id.tabs);
        ViewPager pager = inflate.findViewById(R.id.pager);
        pager.setAdapter(adepter);
        tabLayout.setupWithViewPager(pager);




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

                    return getResources().getString(R.string.all);
                case 1:
                    return getResources().getString(R.string.firstSemester);
                case 2:
                    return getResources().getString(R.string.secondSemester);
                case 3:
                    return getResources().getString(R.string.thirdSemester);
                case 4:
                    return getResources().getString(R.string.fourthSemester);
                case 5:
                    return getResources().getString(R.string.fifthSemester);
            }
            return null;

        }


    }

}
