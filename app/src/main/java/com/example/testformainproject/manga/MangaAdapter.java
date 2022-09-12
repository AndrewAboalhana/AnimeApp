package com.example.testformainproject.manga;

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

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.MangaHolder> {
    List<MangaItem> manga;

    public MangaAdapter(List<MangaItem> manga) {
        this.manga = manga;
    }

    @NonNull
    @Override
    public MangaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MangaHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.manga_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MangaHolder holder, int position) {
         MangaItem mangaItem=manga.get(position);
        Glide.with(holder.itemView).load(mangaItem.getImageUrl()).into(holder.imageView);
        holder.textView.setText(mangaItem.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MangaDetails.class);
                intent.putExtra("imageUrl",mangaItem.getImageUrl());
                intent.putExtra("title",mangaItem.getTitle());
                intent.putExtra("details",mangaItem.getSynopsis());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return manga.size();
    }

    class MangaHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MangaHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.ivMangaImage);
            textView=itemView.findViewById(R.id.tvTitleManga);
        }
    }
}
