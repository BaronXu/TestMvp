package com.m4399.testmvp.entities;

import java.util.List;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class ResponseEntity<T> {

    public int code;
    public int msg;
    public T obj;
    public List<T> list;



}
