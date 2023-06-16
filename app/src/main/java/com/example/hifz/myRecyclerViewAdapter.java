package com.example.hifz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.MyVH> {
    List<Students> studentList;
    public myRecyclerViewAdapter(List<Students> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public myRecyclerViewAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singe_item, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVH holder, int position) {
        holder.data=studentList.get(position);
        holder.textViewId.setText(holder.data.getId());
        holder.textViewName.setText(holder.data.getName());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }


    public class MyVH extends RecyclerView.ViewHolder {
        //ImageView imageViewFriend;
        TextView textViewId;
        TextView textViewName;
       // TextView textViewCity;
        Students data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
          
            textViewId = itemView.findViewById(R.id.textViewId);
            textViewName = itemView.findViewById(R.id.textViewName);
            //textViewCity = itemView.findViewById(R.id.textViewCity);
        }
    }
}


