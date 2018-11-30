package com.example.taojun.neteasecloudmusic.api;

import com.example.taojun.neteasecloudmusic.item.UserItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserInterface {
    @GET("login/cellphone")
    Call<UserItem> getUsers(@Query("phone") String phone, @Query("password") String phonePassword);


}
