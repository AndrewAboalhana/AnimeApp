package com.example.testformainproject.manga;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface MangaApi {


    @GET("magazine/1/1")
    Call<MangaResponse> getManga(
            @Header("X-RapidAPI-Key")  String apikey,
            @Header("X-RapidAPI-Host") String hostApi
    );
}
