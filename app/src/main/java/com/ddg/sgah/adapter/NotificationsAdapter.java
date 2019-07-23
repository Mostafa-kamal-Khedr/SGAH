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

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mostafa khedr on 18,يوليو,2019
 */
public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.ViewHolder> {


    public String[] notificationsList;



    public NotificationsAdapter(String[] notificationsList) {
        this.notificationsList = notificationsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notifications, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.notificationTitle.setText(notificationsList[i]);
    }

    @Override
    public int getItemCount() {
        return notificationsList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textView2)
        TextView notificationTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
