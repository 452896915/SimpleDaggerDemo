package com.magic.wangdongliang.simpledaggerdemo.daggerutils;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import thirdpartyutility.ThirdPartyUtility;

/**
 * Created by wangdongliang on 16/8/30.
 */

@Module
public class ModuleClass {
    private final Context context;

    public ModuleClass(Context context) {
        this.context = context;
    }

    @Provides
    Context provideContext() {
        return context;
    }

    @Provides
    ThirdPartyUtility provideThirdPartyUtility() {
        return new ThirdPartyUtility(context);
    }
}
