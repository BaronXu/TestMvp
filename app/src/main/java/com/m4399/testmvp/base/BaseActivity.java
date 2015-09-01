package com.m4399.testmvp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    protected void showProgress(String msg){

    }

    protected void hideProgress(){

    }
}
