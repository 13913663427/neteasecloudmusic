package com.example.taojun.neteasecloudmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.taojun.neteasecloudmusic.R;
import com.example.taojun.neteasecloudmusic.api.Api;
import com.example.taojun.neteasecloudmusic.api.UserInterface;
import com.example.taojun.neteasecloudmusic.item.UserItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btn_register).setOnClickListener(this);
        findViewById(R.id.btn_login).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_register:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btn_login:
                doLogin();
                break;
        }
    }

    private void doLogin() {
        Retrofit retrofit = Api.getRetrofit();
        UserInterface userInterface = retrofit.create(UserInterface.class);
        Call<UserItem> call = userInterface.getUsers("18251986292", "qzb941010");
        call.enqueue(new Callback<UserItem>() {
            @Override
            public void onResponse(Call<UserItem> call, Response<UserItem> response) {
                Log.e("http", response.body().getProfile().getNickname());
            }

            @Override
            public void onFailure(Call<UserItem> call, Throwable t) {

            }
        });
    }
}
