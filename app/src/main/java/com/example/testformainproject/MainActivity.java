package com.example.testformainproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.testformainproject.api.AnimeAdapter;
import com.example.testformainproject.api.AnimeResponse;
import com.example.testformainproject.api.IApi;
import com.example.testformainproject.loginandregister.LoginActivity;
import com.example.testformainproject.manga.MangaActivity;
import com.example.testformainproject.search.SearchActivity;
import com.google.firebase.auth.FirebaseAuth;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Top Anime");

        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl("https://jikan1.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IApi iApi=retrofit.create(IApi.class);
        iApi.getAnime("3521346e84msh0c20be4a46ac4b7p1d009djsnd429b09981e3","jikan1.p.rapidapi.com").enqueue(new Callback<AnimeResponse>() {
            @Override
            public void onResponse(Call<AnimeResponse> call, Response<AnimeResponse> response) {
                RecyclerView recyclerView=findViewById(R.id.rvAnime);
                AnimeAdapter animeAdapter=new AnimeAdapter(response.body().getTop());
                recyclerView.setAdapter(animeAdapter);
            }

            @Override
            public void onFailure(Call<AnimeResponse> call, Throwable t) {
                System.out.println("Apis => " + t.getLocalizedMessage());

            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item_search){
        Intent intent=new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
        }
        if(item.getItemId()==R.id.item_logout){
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent intent=new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.item_manga){
             Intent intent= new Intent(this, MangaActivity.class);
             startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }



}