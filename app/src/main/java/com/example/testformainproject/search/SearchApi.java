package com.example.testformainproject.search;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface SearchApi {

    @GET("search/anime")
    Call<SearchResponse> getSearch(
            @Header("X-RapidAPI-Key") String apiKey,
            @Header("X-RapidAPI-Host") String host,
            @Query("q") String animeName
    );
}
