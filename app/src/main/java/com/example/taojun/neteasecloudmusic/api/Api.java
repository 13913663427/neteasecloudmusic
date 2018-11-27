package com.example.taojun.neteasecloudmusic.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()//
                    .baseUrl(NetWorkConstants.BASE_URL)//
                    .addConverterFactory(GsonConverterFactory.create())//
                    .build();
        }
        return retrofit;//必须有返回值

    }
}
