package com.example.testformainproject.api;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.testformainproject.R;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeHolder> {

    List<TopItem> items;

    public AnimeAdapter(List<TopItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public AnimeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimeHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeHolder holder, int position) {

        TopItem topItem=items.get(position);
        Glide.with(holder.itemView).load(topItem.getImageUrl()).into(holder.imageView);
        holder.textView.setText(topItem.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),ItemDetails.class);
                intent.putExtra("imageUrl",topItem.getImageUrl());
                intent.putExtra("title", topItem.getTitle());
                intent.putExtra("type",topItem.getType());
                intent.putExtra("rank",topItem.getRank());
                intent.putExtra("members",topItem.getMembers());
                intent.putExtra("score",topItem.getScore());
                intent.putExtra("url",topItem.getUrl());
                view.getContext().startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    class AnimeHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public AnimeHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivImage);
            textView = itemView.findViewById(R.id.tvTitle);
        }
    }
}
