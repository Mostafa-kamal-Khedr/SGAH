package com.ddg.sgah.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mostafa khedr on 18,يوليو,2019
 */
public class HomeFilesAdapter extends RecyclerView.Adapter<HomeFilesAdapter.ViewHolder> {
    public List<HomeListModel> homeListModels;

    Activity context;

    public HomeFilesAdapter(List<HomeListModel> homeListModels, Activity context) {
        this.homeListModels = homeListModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_files, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(homeListModels.get(i).getImage())
                .into(viewHolder.imageView);
        viewHolder.textView.setText(homeListModels.get(i).getTitle());

    }


    @Override
    public int getItemCount() {
        return homeListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.textView)
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
