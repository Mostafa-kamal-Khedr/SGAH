package com.ddg.sgah.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.adapter.HomeNewAdapter;
import com.ddg.sgah.data.db.HomeListsData;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {


    @BindView(R.id.rc_home_news)
    RecyclerView rcHomeNews;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_news, container, false);


        ButterKnife.bind(this, inflate);
        inflateRecyclerView();



        return inflate;
    }



    private void inflateRecyclerView() {
        rcHomeNews.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayout.VERTICAL, false));
        List<HomeListModel> news = HomeListsData.getNews();
        rcHomeNews.setAdapter(new HomeNewAdapter(news, "newsActivity"));

    }


}
