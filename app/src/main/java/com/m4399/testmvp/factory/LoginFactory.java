package com.m4399.testmvp.factory;

import com.m4399.testmvp.presenter.ILoginPresenter;
import com.m4399.testmvp.presenter.LoginPresenter;
import com.m4399.testmvp.view.LoginView;

/**
 * 测试
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class LoginFactory {

    public static ILoginPresenter newInstance(LoginView view,int status){

        return new LoginPresenter(view);

    }
}
