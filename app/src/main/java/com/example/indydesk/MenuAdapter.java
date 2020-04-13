package com.example.indydesk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {
    Context context;
    List<Rowitem> rowItems;

    MenuAdapter(Context context, List<Rowitem> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mycard, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Rowitem rowitem=rowItems.get(position);
        holder.pict.setImageResource(rowitem.getPict());
        holder.fooditem.setText(rowitem.getFooditem());
        holder.price.setText(rowitem.getPrice());

    }

    @Override
    public int getItemCount() {
        return rowItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView fooditem,price;
        public ImageView pict;

        public MyViewHolder(View view) {
            super(view);
           fooditem=view.findViewById(R.id.fooditem);
           price=view.findViewById(R.id.price);
           pict=view.findViewById(R.id.pict);
        }
    }
}
