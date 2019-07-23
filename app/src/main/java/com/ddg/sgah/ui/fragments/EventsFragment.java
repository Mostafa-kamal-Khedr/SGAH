package com.ddg.sgah.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.helper.ImageDialog;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    @BindView(R.id.tv_mycoursesTitle)
    TextView tvMycoursesTitle;
    @BindView(R.id.tv_firstFall)
    TextView tvFirstFall;
    @BindView(R.id.tv_secondSpring)
    TextView tvSecondFall;
    @BindView(R.id.tv_summer)
    TextView tvThirdFall;
    private String language;

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_events, container, false);
        ButterKnife.bind(this, inflate);


        return inflate;
    }


    @OnClick({R.id.tv_firstFall, R.id.tv_secondSpring, R.id.tv_summer})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_firstFall:
                language = Locale.getDefault().getLanguage();
                if (language.equals("ar")) {
                    ImageDialog.setImageBigger(getActivity(), R.drawable.fall_ar);

                } else {
                    ImageDialog.setImageBigger(getActivity(), R.drawable.fall_en);

                }
                break;
            case R.id.tv_secondSpring:
                language = Locale.getDefault().getLanguage();
                if (language.equals("ar")) {
                    ImageDialog.setImageBigger(getActivity(), R.drawable.spring_ar);

                } else {
                    ImageDialog.setImageBigger(getActivity(), R.drawable.spring_en);

                }
                break;
            case R.id.tv_summer:
                language = Locale.getDefault().getLanguage();
                if (language.equals("ar")) {
                    ImageDialog.setImageBigger(getActivity(), R.drawable.summer_ar);

                } else {
                    ImageDialog.setImageBigger(getActivity(), R.drawable.summer_en);

                }


                break;
        }
    }
}
