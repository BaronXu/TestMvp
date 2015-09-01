package com.m4399.testmvp.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.m4399.testmvp.base.BaseActivity;
import com.m4399.testmvp.R;
import com.m4399.testmvp.common.Constants;
import com.m4399.testmvp.presenter.SecondPresenter;
import com.m4399.testmvp.view.SecondView;

import butterknife.Bind;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class SecondActivity extends BaseActivity implements SecondView {

    @Bind(R.id.text_sencod_username)
    TextView mUserNameText;

    SecondPresenter presenter;

    String mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_second);

        mUserName = getIntent().getStringExtra(Constants.ExtraMsg.EXTRA_USERNAME);
        presenter = new SecondPresenter(this);
        presenter.setUserName(mUserName);

    }


    @Override
    public void setUserName(String userName) {
        mUserNameText.setText(userName);
    }
}
