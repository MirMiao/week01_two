package com.bw.week01_two.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 时间 :2019/12/2  18:54
 * 作者 :苗恒
 * 功能 :
 */
public abstract class BaseActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayoutid());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int bindLayoutid();
}
