package com.ddg.sgah.ui.fragments.course;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ddg.sgah.R;
import com.ddg.sgah.helper.FileDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentsFragment extends Fragment {


    @BindView(R.id.relativeLayout2)
    RelativeLayout relativeLayout2;
    @BindView(R.id.relativeLayout3)
    RelativeLayout relativeLayout3;

    public ContentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_contents, container, false);


        ButterKnife.bind(this, inflate);

        return inflate;
    }


    @OnClick({R.id.relativeLayout2, R.id.relativeLayout3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.relativeLayout2:
                FileDialog.viewPdf(getActivity(), "math_home_work.pdf");

                break;
            case R.id.relativeLayout3:
                FileDialog.viewPdf(getActivity(), "math_lecture_note.pdf");


                break;
        }
    }
}
