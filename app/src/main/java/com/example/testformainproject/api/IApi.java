package com.example.testformainproject.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface IApi {

    @GET("top/anime/1/upcoming")
    Call<AnimeResponse> getAnime(
            @Header("X-RapidAPI-Key")  String apikey,
            @Header("X-RapidAPI-Host") String host

    );

}
