package com.example.testformainproject.search;

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
import com.example.testformainproject.api.ItemDetails;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchHolder> {
    List<ResultsItem> resultsItems;

    public SearchAdapter(List<ResultsItem> resultsItems) {
        this.resultsItems = resultsItems;
    }

    @NonNull
    @Override
    public SearchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchHolder holder, int position) {
        ResultsItem item=resultsItems.get(position);
        Glide.with(holder.itemView).load(item.getImageUrl()).into(holder.imageView);
        holder.textView.setText(item.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), SearchDetails.class);
                intent.putExtra("imageUrl",item.getImageUrl());
                intent.putExtra("title", item.getTitle());
                intent.putExtra("type",item.getType());
                intent.putExtra("synopsis",item.getSynopsis());
                intent.putExtra("url",item.getUrl());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return resultsItems.size();
    }


    class SearchHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public SearchHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivImage);
            textView = itemView.findViewById(R.id.tvTitle);
        }
    }
}
