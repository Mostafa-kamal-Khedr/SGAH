package com.ddg.sgah.adapter;

import android.app.Activity;
import android.content.Intent;
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
import com.ddg.sgah.ui.activity.CourseContent;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mostafa kamal khedr on 19,July,2019
 */
public class StudyPlanAdapter extends RecyclerView.Adapter<StudyPlanAdapter.ViewHolder> {

    public List<HomeListModel> homeListModels;
    private Activity activity;

    public StudyPlanAdapter(List<HomeListModel> homeListModels, Activity activity) {
        this.homeListModels = homeListModels;
        this.activity = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_studu_plan, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        viewHolder.textView2.setText(homeListModels.get(i).getTitle());
        viewHolder.textViewCopy.setText(homeListModels.get(i).getTitle());
        viewHolder.divisionNumber.setText(homeListModels.get(i).getSection());
        viewHolder.referenceNumber.setText(homeListModels.get(i).getReference());
        viewHolder.teacherName.setText(homeListModels.get(i).getTeacher());
        viewHolder.relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.startActivity(new Intent(activity, CourseContent.class));


            }
        });
    }

    @Override
    public int getItemCount() {
        return homeListModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textView2)
        TextView textView2;
        @BindView(R.id.textViewCopy)
        TextView textViewCopy;
        @BindView(R.id.imageView2)
        ImageView imageView2;
        @BindView(R.id.sub_title)
        TextView subTitle;
        @BindView(R.id.divisionNumber)
        TextView divisionNumber;
        @BindView(R.id.reference_title)
        TextView referenceTitle;
        @BindView(R.id.reference_number)
        TextView referenceNumber;
        @BindView(R.id.teacher_title)
        TextView teacherTitle;
        @BindView(R.id.teacher_name)
        TextView teacherName;
        @BindView(R.id.relativeLayout2)
        RelativeLayout relativeLayout2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
