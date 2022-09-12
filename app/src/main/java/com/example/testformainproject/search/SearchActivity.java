package com.example.testformainproject.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.testformainproject.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {
    String apikey="3521346e84msh0c20be4a46ac4b7p1d009djsnd429b09981e3";
    String host="jikan1.p.rapidapi.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_search);

        getSupportActionBar().setTitle("Choose your one");

    }
    public void searchButton(View view) {
        EditText editText=findViewById(R.id.searchEditText);
        String search =editText.getText().toString();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://jikan1.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SearchApi searchApi=retrofit.create(SearchApi.class);
        searchApi.getSearch(apikey,host,search).enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {

                RecyclerView recyclerView=findViewById(R.id.rvSearch);
                SearchAdapter searchAdapter=new SearchAdapter(response.body().getResults());
                recyclerView.setAdapter(searchAdapter);
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {

            }
        });
    }



}