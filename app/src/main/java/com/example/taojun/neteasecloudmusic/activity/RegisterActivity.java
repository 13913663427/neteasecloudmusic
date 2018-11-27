package com.example.taojun.neteasecloudmusic.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.taojun.neteasecloudmusic.R;

public class RegisterActivity extends BaseActivity {

    private Toolbar toolbar;

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
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
        toolbar = findViewById(R.id.toolbar);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

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
}
