package com.m4399.testmvp.presenter;

import android.text.TextUtils;

import com.m4399.testmvp.R;
import com.m4399.testmvp.model.ILoginService;
import com.m4399.testmvp.model.LoginServiceImpl;
import com.m4399.testmvp.view.LoginView;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class LoginPresenter implements ILoginPresenter {

    private LoginView view;
    private ILoginService service;

    public LoginPresenter(LoginView view){

        service = new LoginServiceImpl();

        this.view = view;
    }

    /**
     * 带年纪登录
     */
    public void onLoginClick(){
        String userName = view.getUserName();

        if (TextUtils.isEmpty(userName)){
            view.setUserNameError(R.string.errror_username_empty);
            return;
        }

        boolean result = service.doLogin(userName);

        if (result) {
            //登录成功
            view.loginSucceed(userName);
        } else {
            //登录失败
            view.loginError(R.string.errror_login_failed);

        }

    }
}
