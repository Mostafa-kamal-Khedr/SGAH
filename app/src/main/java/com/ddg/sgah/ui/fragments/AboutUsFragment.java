package com.ddg.sgah.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ddg.sgah.R;

import static com.ddg.sgah.ui.activity.BaseActivity.navigationView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {


    public AboutUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_about_us, container, false);
        navigationView.getMenu().findItem(R.id.nav_aboutUs).setChecked(true);
        ImageView iv_aboutUsBack = inflate.findViewById(R.id.iv_aboutUsBack);
        iv_aboutUsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });




        return inflate;

    }

}
