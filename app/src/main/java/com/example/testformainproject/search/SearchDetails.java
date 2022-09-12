package com.example.testformainproject.search;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testformainproject.R;

public class SearchDetails extends AppCompatActivity {
ImageView imageView;
TextView titleText,typeText,detailsText;
String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_details);
        getSupportActionBar().setTitle("Anime Details");
        String imageUrl=getIntent().getStringExtra("imageUrl");
        String title= getIntent().getStringExtra("title");
        String type=getIntent().getStringExtra("type");
        String details=getIntent().getStringExtra("synopsis");
        url=getIntent().getStringExtra("url");


        imageView=findViewById(R.id.imageSearch);
        Glide.with(this).load(imageUrl).into(imageView);
        titleText=findViewById(R.id.tvTitleSearch);
        titleText.setText(title);
        typeText=findViewById(R.id.tvTypeSearch);
        typeText.setText(type);
        detailsText=findViewById(R.id.tvDetails);
        detailsText.setText(details);

    }

    public void navigateToSearchWeb(View view) {
        Intent intent=new Intent(SearchDetails.this,WebViewSearch.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }
}