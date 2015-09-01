package com.m4399.testmvp.view;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public interface LoginView {
   public String getUserName();

    void setUserNameError(int resId);

    void loginError(int resId);

    void loginSucceed(String userName);
}
