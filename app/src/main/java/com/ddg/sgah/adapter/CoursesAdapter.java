package com.ddg.sgah.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mostafa khedr on 18,يوليو,2019
 */
public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.ViewHolder> {


    public List<HomeListModel> homeListModels;



    public CoursesAdapter(List<HomeListModel> homeListModels) {
        this.homeListModels = homeListModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_studu_plan, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.subTitle2.setText(homeListModels.get(i).getTitleString());
    }

    @Override
    public int getItemCount() {
        return homeListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.textView2)
        TextView textView2;
        @BindView(R.id.imageView2)
        ImageView imageView2;
        @BindView(R.id.sub_title)
        TextView subTitle;
        @BindView(R.id.sub_title2)
        TextView subTitle2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
