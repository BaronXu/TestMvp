package com.m4399.testmvp.model;

/**
 * 登录接口类
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public interface ILoginService {

    /**
     *
     * {"code":10000,"msg":"",data:{}}
     * {"code":10000,"msg":"",data:{}}
     *
     *
     */

    /**
     *
     * @param userName
     * @return
     */
    public boolean doLogin(String userName);

    public void getUserNameById(String id);

}
