package com.m4399.testmvp.listeners;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public interface ILoaderListener<T> {
    public void onSuccess(T result);
    public void onError(Exception e);
}
