package com.example.taojun.neteasecloudmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.taojun.neteasecloudmusic.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {






    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        findViewById(R.id.btn_phone_init).setOnClickListener(this);
        findViewById(R.id.btn_mail_init).setOnClickListener(this);

//        findViewById(R.id.btn_mail_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_phone_init:
                startActivity(new Intent(this, PhoneLoginActivity.class));
                break;

            case R.id.btn_mail_init:
                startActivity(new Intent(this,MailLoginActivity.class));
                break;

        }
    }


}
