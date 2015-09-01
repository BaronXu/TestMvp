package com.m4399.testmvp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.m4399.testmvp.R;
import com.m4399.testmvp.base.BaseActivity;
import com.m4399.testmvp.factory.LoginFactory;
import com.m4399.testmvp.presenter.ILoginPresenter;
import com.m4399.testmvp.util.ActivityUtil;
import com.m4399.testmvp.view.LoginView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements LoginView {

    @Bind(R.id.text_main_username)
    TextView mUserNameText;
    @Bind(R.id.edit_main_username)
    EditText mUserNameEdit;

    ILoginPresenter presenter;

    public static String sUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sUserName = "test";
        presenter = LoginFactory.newInstance(this,0);

     }

    /**
     * 登录按钮点击事件
     * @param v
     */
    @OnClick(R.id.btn_main_login)
    protected void onLoginClick(View v){
        presenter.onLoginClick();
    }

    /**
     * 获取用户名
     * @return
     */
    @Override
    public String getUserName() {
        return mUserNameEdit.getText().toString();
    }

    @Override
    public void setUserNameError(int resId) {
        mUserNameEdit.setError(getString(resId));
    }

    @Override
    public void loginError(int resId) {
        Toast.makeText(this,resId,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSucceed(String userName) {
        ActivityUtil.openSencodActivity(this,userName);
     }
}
