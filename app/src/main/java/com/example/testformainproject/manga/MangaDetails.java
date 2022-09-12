package com.example.testformainproject.manga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testformainproject.R;

public class MangaDetails extends AppCompatActivity {
    ImageView imageView;
    TextView textViewTitle,textViewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga_details);
        getSupportActionBar().setTitle("Manga Details");

        String imageUrl=getIntent().getStringExtra("imageUrl");
        String title= getIntent().getStringExtra("title");
        String details=getIntent().getStringExtra("details");


        imageView=findViewById(R.id.ivMangaDetails);
        Glide.with(this).load(imageUrl).into(imageView);
        textViewTitle=findViewById(R.id.tvMangaDetailsTitle);
        textViewTitle.setText(title);
        textViewDetails=findViewById(R.id.tvMangaDescription);
        textViewDetails.setText(details);
    }
}