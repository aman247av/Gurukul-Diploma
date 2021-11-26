package com.gap.mobigpk1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AutoScroll extends RecyclerView.Adapter<AutoScroll.ViewHolder> {
    View view;
    List<Integer> imageList;
    AutoScroll(List<Integer> list)
    {
        this.imageList=list;
    }
    Context context;
   /* public AutoScroll(Context context){
        this.context=context;
    }
     @NonNull
    */



    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(imageList.get(position));
        //holder.text0.setText("Position"+position);
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //TextView text0;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            //text0= itemView.findViewById(R.id.text0);
        }
    }
}
