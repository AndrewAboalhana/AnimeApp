package com.example.testformainproject.api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.CursorLoader;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testformainproject.R;

public class ItemDetails extends AppCompatActivity {
ImageView imageViewOne;
TextView titleText,typeText,rankText,scoreText,memberText;
String url;
int rank;
int score;
int members;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        getSupportActionBar().setTitle("Anime Details");

        String imageUrl=getIntent().getStringExtra("imageUrl");
        String title= getIntent().getStringExtra("title");
        String type=getIntent().getStringExtra("type");
         url=getIntent().getStringExtra("url");
         rank =getIntent().getIntExtra("rank",-1);
         score=getIntent().getIntExtra("score",-1);
        members=getIntent().getIntExtra("members",-1);


        imageViewOne=findViewById(R.id.imageAnime);
        Glide.with(this).load(imageUrl).into(imageViewOne);
        titleText=findViewById(R.id.tvChoosenAnime);
        typeText=findViewById(R.id.tvType);
        rankText=findViewById(R.id.tvRank);
        scoreText=findViewById(R.id.tvScore);
        memberText=findViewById(R.id.tvMember);
        titleText.setText(title);
        typeText.setText(type);
        rankText.setText(String.valueOf(rank));
        scoreText.setText(String.valueOf(score));
        memberText.setText(String.valueOf(members));






    }



    public void navigateToWeb(View view) {
        Intent intent=new Intent(ItemDetails.this,WebViewActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }
}