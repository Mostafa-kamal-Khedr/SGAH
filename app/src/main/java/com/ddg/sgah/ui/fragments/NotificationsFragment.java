package com.ddg.sgah.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ddg.sgah.R;
import com.ddg.sgah.adapter.HomeNewAdapter;
import com.ddg.sgah.adapter.NotificationsAdapter;
import com.ddg.sgah.data.db.HomeListsData;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {

    @BindView(R.id.rc_home_news)
    RecyclerView rcHomeNews;
    private String[] notificationsList;

    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_notifications, container, false);
        ButterKnife.bind(this, inflate);

        notificationsList = getResources().getStringArray(R.array.notificationsList);


        rcHomeNews.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayout.VERTICAL, false));



        rcHomeNews.setAdapter(new NotificationsAdapter(notificationsList));
        return inflate;


    }

}
