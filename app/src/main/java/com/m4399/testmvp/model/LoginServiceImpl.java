package com.m4399.testmvp.model;

import android.text.TextUtils;

import com.m4399.testmvp.entities.ResponseEntity;
import com.m4399.testmvp.entities.User;

import java.util.List;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class LoginServiceImpl implements ILoginService {

    private static final String USER = "admin";

    //volley
    //okhttp

    @Override
    public boolean doLogin(String userName) {
        if (TextUtils.isEmpty(userName)){
            return false;
        }
        if (userName.equals(USER)){
            return true;
        }else {
            return false;
        }
     }

    @Override
    public void getUserNameById(String id) {

        ResponseEntity<User> responseEntity = new ResponseEntity<User>();

        User user = responseEntity.obj;
        List<User> userList = responseEntity.list;

        //GSON
    }
}
