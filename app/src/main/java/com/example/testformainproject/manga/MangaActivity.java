package com.example.testformainproject.manga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.testformainproject.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MangaActivity extends AppCompatActivity {
    String apiKey="3521346e84msh0c20be4a46ac4b7p1d009djsnd429b09981e3";
    String hostApi="jikan1.p.rapidapi.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga);
        getSupportActionBar().setTitle("Manga");

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://jikan1.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MangaApi mangaApi=retrofit.create(MangaApi.class);
        mangaApi.getManga(apiKey,hostApi).enqueue(new Callback<MangaResponse>() {
            @Override
            public void onResponse(Call<MangaResponse> call, Response<MangaResponse> response) {
                RecyclerView recyclerView=findViewById(R.id.rvManga);
                MangaAdapter mangaAdapter= new MangaAdapter(response.body().getManga());
                recyclerView.setAdapter(mangaAdapter);
            }

            @Override
            public void onFailure(Call<MangaResponse> call, Throwable t) {

            }
        });

    }
}