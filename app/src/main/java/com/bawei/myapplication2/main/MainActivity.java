package com.bawei.myapplication2.main;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.bawei.myapplication2.R;
import com.bawei.myapplication2.BR;
import com.bawei.myapplication2.databinding.ActivityMainBinding;

import me.goldze.mvvmhabit.base.BaseActivity;

public class MainActivity  extends BaseActivity<ActivityMainBinding, MainViewModel> {

    @Override
    public void initParam() {
        super.initParam();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
