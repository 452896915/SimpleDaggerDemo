package com.magic.wangdongliang.simpledaggerdemo.daggerutils;

import com.magic.wangdongliang.simpledaggerdemo.MainActivity;
import com.magic.wangdongliang.simpledaggerdemo.SecondActivity;

import dagger.Component;

/**
 * Created by wangdongliang on 16/8/30.
 */
@Component(modules = {ModuleClass.class})
public interface ComponentClass {
//  void inject(Context context); // 这里坑死我了，不能这样写！！
    void inject(MainActivity mainActivity);
    void inject(SecondActivity secondActivity);
}
