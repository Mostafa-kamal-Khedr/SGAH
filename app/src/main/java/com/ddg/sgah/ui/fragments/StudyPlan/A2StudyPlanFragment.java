package com.ddg.sgah.ui.fragments.StudyPlan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ddg.sgah.R;
import com.ddg.sgah.adapter.StudyPlanAdapter2;
import com.ddg.sgah.data.db.UsersDb;
import com.ddg.sgah.helper.SharedPreferenceManager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class A2StudyPlanFragment extends Fragment {
    @BindView(R.id.rc_study_plan)
    RecyclerView rcStudyPlan;

    public A2StudyPlanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View inflate = inflater.inflate(R.layout.fragment_a2_study_plan, container, false);
        ButterKnife.bind(this, inflate);
        rcStudyPlan.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayout.VERTICAL, false));
        inflateRecycler();
        return inflate;
    }

    private void inflateRecycler() {


        SharedPreferenceManager sharedPreferenceManager = new SharedPreferenceManager(getActivity());
        String userName1 = sharedPreferenceManager.loadUserName();
        if (userName1 != null) {
            if (userName1.equals("maryam")) {
            String[] allCommunicationStudyPlan = getResources().getStringArray(R.array.studyPlanListSem2Communication);
            rcStudyPlan.setAdapter(new StudyPlanAdapter2(allCommunicationStudyPlan));


        } else {
            String[] allComputersStudyPlan = getResources().getStringArray(R.array.studyPlanListSem2Computer);
            rcStudyPlan.setAdapter(new StudyPlanAdapter2(allComputersStudyPlan));

        }
    }}

}
