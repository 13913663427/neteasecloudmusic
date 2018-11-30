package com.example.taojun.neteasecloudmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.taojun.neteasecloudmusic.R;
import com.example.taojun.neteasecloudmusic.Util.PhoneUtil;
import com.example.taojun.neteasecloudmusic.Util.ToastUtil;
import com.example.taojun.neteasecloudmusic.api.Api;
import com.example.taojun.neteasecloudmusic.api.UserInterface;
import com.example.taojun.neteasecloudmusic.item.UserItem;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PhoneLoginActivity extends BaseActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private EditText phoneET;
    private EditText phonePasswordET;
    String phone;
    String phonePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);// 让左侧的图标显示出来
//            actionBar.setHomeAsUpIndicator(R.mipmap.icon_arrow);// 设置左侧的图标,默认为一个向左的箭头
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_phone_login;
    }

    @Override
    protected void initView() {
        phoneET = findViewById(R.id.et_phone);
        phonePasswordET = findViewById(R.id.et_phone_password);
        toolbar = findViewById(R.id.toolbar);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        findViewById(R.id.btn_phone_login).setOnClickListener(PhoneLoginActivity.this);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 处理各个按钮的点击事件
        switch (item.getItemId()) {
            case android.R.id.home:// 标题栏左侧按钮默认id
                finish();
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_phone_login:
                doPhoneLogin();
                break;
        }
    }

    private void doPhoneLogin() {
        phone = phoneET.getText().toString().trim();
        phonePassword = phonePasswordET.getText().toString().trim();

        if (!PhoneUtil.isPhoneNumber(phone)) {
            ToastUtil.toast(this, "请输入正确的电话号码", Toast.LENGTH_SHORT);
            return;
        }

        if (TextUtils.isEmpty(phonePassword)) {
            ToastUtil.toast(this, "请输入密码", Toast.LENGTH_SHORT);
            return;
        }

        Retrofit retrofit = Api.getRetrofit();
        UserInterface userInterface = retrofit.create(UserInterface.class);
        Call<UserItem> call = userInterface.getUsers(phone, phonePassword);
        call.enqueue(new Callback<UserItem>() {
            @Override
            public void onResponse(Call<UserItem> call, Response<UserItem> response) {
                if (response.body() != null) {
                    UserItem userItem = response.body();
                    if (userItem.getCode() == 200) {
                        startActivity(new Intent(PhoneLoginActivity.this, DrawerLayoutActivity.class));
                    } else {
                        ToastUtil.toast(PhoneLoginActivity.this, userItem.getMsg(), Toast.LENGTH_SHORT);
                    }
                } else {
                    if (response.errorBody() == null) {
                        ToastUtil.toast(PhoneLoginActivity.this, "服务器繁忙请稍后再试", Toast.LENGTH_SHORT);
                        return;
                    }
                    JSONObject errorBody = null;
                    try {
                        errorBody = JSON.parseObject(response.errorBody().string());
                        if (errorBody == null) {
                            ToastUtil.toast(PhoneLoginActivity.this, "服务器繁忙请稍后再试", Toast.LENGTH_SHORT);
                            return;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ToastUtil.toast(PhoneLoginActivity.this, errorBody.getString("msg"), Toast.LENGTH_SHORT);
                }

            }

            @Override
            public void onFailure(Call<UserItem> call, Throwable t) {
                Log.e("http", t.toString());
            }
        });
    }


}
