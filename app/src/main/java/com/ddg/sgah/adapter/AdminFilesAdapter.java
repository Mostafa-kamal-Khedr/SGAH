package com.ddg.sgah.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mostafa khedr on 18,يوليو,2019
 */
public class AdminFilesAdapter extends RecyclerView.Adapter<AdminFilesAdapter.ViewHolder> {
    public List<HomeListModel> homeListModels;

    Activity context;


    public AdminFilesAdapter(List<HomeListModel> homeListModels, Activity context) {
        this.homeListModels = homeListModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_admin, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        viewHolder.textView1.setText(homeListModels.get(position).getTitle());
        viewHolder.textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeListModels.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, homeListModels.size());


            }
        });

    }


    @Override
    public int getItemCount() {
        return homeListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.textView1)
        TextView textView1;
        @BindView(R.id.imageView1)
        ImageView imageView1;
        @BindView(R.id.sub_title1)
        TextView subTitle1;
        @BindView(R.id.textView3)
        TextView textView3;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
