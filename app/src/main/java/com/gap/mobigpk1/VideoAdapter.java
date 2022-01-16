package com.gap.mobigpk1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.gap.mobigpk1.Model.Category;

public class VideoAdapter extends FirebaseRecyclerAdapter<Category,VideoAdapter.myViewHolder> {

    public VideoAdapter(@NonNull FirebaseRecyclerOptions<Category> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int i, @NonNull Category category) {

        holder.categoryName.setText(category.getCategoryName());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity=(AppCompatActivity) v.getContext();

                Intent intent=new Intent(activity,video_lectures.class);
                intent.putExtra("title",category.getCategoryId());
                activity.startActivity(intent);
            }
        });

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v1= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_btn_firebase,parent,false);
        return new myViewHolder(v1);
    }

    static class myViewHolder extends RecyclerView.ViewHolder{
        public TextView categoryName;
        public RecyclerView category_recyclerView;
        public RecyclerView.LayoutManager manager;
        RelativeLayout relativeLayout;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout=itemView.findViewById(R.id.relative);
            manager=new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
            categoryName=itemView.findViewById(R.id.category_name);
            category_recyclerView=itemView.findViewById(R.id.recyclerView);
            category_recyclerView.setLayoutManager(manager);

        }
    }
}


