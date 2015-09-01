package com.m4399.testmvp.presenter;

import com.m4399.testmvp.view.SecondView;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class SecondPresenter {

    SecondView view;

    public SecondPresenter(SecondView view) {
        this.view = view;
    }

    public void setUserName(String name){
        view.setUserName(name);
    }

}
