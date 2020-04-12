package com.example.indydesk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Album> albumList;
    AlbumClickListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }


    public AlbumsAdapter(Context mContext, List<Album> albumList, AlbumClickListener listener) {
        this.mContext = mContext;
        this.albumList = albumList;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Album album = albumList.get(position);
        System.out.println(album+" is here");
        holder.title.setText(album.getName());

        holder.count.setText(album.getDiscount() + "% off");


        // loading album cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onAlbumClick(album);

            }
        });
        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Toast.makeText(mContext, "Soft Drinks", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, TiwariUncle.class);
                    mContext.startActivity(intent);
                }
                if(position==1){
                    Toast.makeText(mContext, "Hello friends! Let's have chai", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, TiwariUncle.class);
                    mContext.startActivity(intent);
                }
                if(position==2){
                    Toast.makeText(mContext, "Healthy Wealthy Amul", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, TiwariUncle.class);
                    mContext.startActivity(intent);
                }
                if(position==3){
                    Toast.makeText(mContext, "Something Chinese", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, TiwariUncle.class);
                    mContext.startActivity(intent);
                }
                if(position==4){
                    Toast.makeText(mContext, "Everyday Snacks", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, TiwariUncle.class);
                    mContext.startActivity(intent);
                }
                if(position==5){
                    Toast.makeText(mContext, "Wafers and Chocolates", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, TiwariUncle.class);
                    mContext.startActivity(intent);
                }

            }
        });
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    /*private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    *//**
     * Click listener for popup menu items
     *//*
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Add to favourite", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_play_next:
                    Toast.makeText(mContext, "Play next", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }*/

    @Override
    public int getItemCount() {
        return albumList.size();
    }

}
