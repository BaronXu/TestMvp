package com.m4399.testmvp.loader;

import android.os.AsyncTask;

import com.m4399.testmvp.listeners.ILoaderListener;

/**
 * 描述信息
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public class MapLoader {

    public static void loadMap(ILoaderListener<String> listener){

        //do process...

        if (listener != null) {
            listener.onSuccess("succeed");
        }
    }
}
