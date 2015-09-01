package com.m4399.testmvp.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.m4399.testmvp.common.Constants;
import com.m4399.testmvp.ui.SecondActivity;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class ActivityUtil {

    public static void openSencodActivity(Activity activity,String username) {
        Intent intent =new Intent(activity, SecondActivity.class);
        intent.putExtra(Constants.ExtraMsg.EXTRA_USERNAME,username);
        activity.startActivity(intent);
    }
}
