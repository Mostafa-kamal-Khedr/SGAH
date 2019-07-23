package com.ddg.sgah.ui.fragments.course;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ddg.sgah.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParticipentsFragment extends Fragment {


    public ParticipentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_participents, container, false);
    }

}
