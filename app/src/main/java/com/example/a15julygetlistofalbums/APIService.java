package com.example.a15julygetlistofalbums;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("albums")
    Call<List<ResponseModel>> getAlbums();
}
