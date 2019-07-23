package com.ddg.sgah.data.db;

import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mostafa khedr on 20,يوليو,2019
 */
public class NotificationsDb {


    public static List<HomeListModel> getNotificationsList() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.FiberOptics, "80"));
        homeCoursesListModels.add(new HomeListModel(R.string.SelectedTopics, "30"));

        return homeCoursesListModels;
    }


}
