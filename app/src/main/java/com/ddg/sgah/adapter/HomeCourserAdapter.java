package com.ddg.sgah.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mostafa khedr on 18,يوليو,2019
 */
public class HomeCourserAdapter extends RecyclerView.Adapter<HomeCourserAdapter.ViewHolder> {
    public List<HomeListModel> homeListModels;


    public HomeCourserAdapter(List<HomeListModel> homeListModels) {
        this.homeListModels = homeListModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_mycourses, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvCourseTitle.setText(homeListModels.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return homeListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_courseTitle)
        TextView tvCourseTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
