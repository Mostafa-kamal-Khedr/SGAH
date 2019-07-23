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
public class HomeNewAdapter extends RecyclerView.Adapter<HomeNewAdapter.ViewHolder> {

    public List<HomeListModel> homeListModels;
    public String newsLocation;
    private View view;

    public HomeNewAdapter(List<HomeListModel> homeListModels, String newsLocation) {
        this.homeListModels = homeListModels;
        this.newsLocation = newsLocation;
    }

    public HomeNewAdapter(List<HomeListModel> homeListModels) {
        this.homeListModels = homeListModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        if (newsLocation.equals("home")) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        } else if (newsLocation.equals("newsActivity")) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_activity, parent, false);

        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.textView.setText(homeListModels.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return homeListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textView)
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
