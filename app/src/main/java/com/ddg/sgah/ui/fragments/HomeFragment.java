package com.ddg.sgah.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.ddg.sgah.R;
import com.ddg.sgah.adapter.HomeCourserAdapter;
import com.ddg.sgah.adapter.HomeFilesAdapter;
import com.ddg.sgah.adapter.HomeNewAdapter;
import com.ddg.sgah.data.db.HomeListsData;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    @BindView(R.id.civ_profileImage)
    CircleImageView civProfileImage;
    @BindView(R.id.relativeLayout)
    RelativeLayout relativeLayout;
    @BindView(R.id.rc_home_courses)
    RecyclerView rcHomeCourses;
    @BindView(R.id.rc_home_files)
    RecyclerView rcHomeFiles;
    @BindView(R.id.rc_home_news)
    RecyclerView rcHomeNews;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, inflate);
        inflateRecyclers();
        return inflate;


    }

    private void inflateRecyclers() {

        rcHomeCourses.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayout.HORIZONTAL, false));
        List<HomeListModel> homeCourses = HomeListsData.getHomeCourses();
        rcHomeCourses.setAdapter(new HomeCourserAdapter(homeCourses));


        rcHomeFiles.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayout.HORIZONTAL, false));
        List<HomeListModel> filesCourses = HomeListsData.getFilesCourses();
        rcHomeFiles.setAdapter(new HomeFilesAdapter(filesCourses, getActivity()));


        rcHomeNews.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayout.HORIZONTAL, false));
        List<HomeListModel> news = HomeListsData.getNews();
        rcHomeNews.setAdapter(new HomeNewAdapter(news, "home"));
    }


}
