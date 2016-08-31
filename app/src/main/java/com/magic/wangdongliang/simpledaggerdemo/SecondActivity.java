package com.magic.wangdongliang.simpledaggerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.magic.wangdongliang.simpledaggerdemo.daggerutils.DaggerComponentClass;
import com.magic.wangdongliang.simpledaggerdemo.daggerutils.ModuleClass;

import javax.inject.Inject;

import thirdpartyutility.ThirdPartyUtility;

/**
 * Created by wangdongliang on 16/8/31.
 */
public class SecondActivity extends AppCompatActivity {
    @Inject
    ThirdPartyUtility thirdPartyUtility;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.detail_layout);

        DaggerComponentClass.builder().moduleClass(new ModuleClass(this)).build().inject(this);

        thirdPartyUtility.showToast("这是内容详情页");
    }
}
