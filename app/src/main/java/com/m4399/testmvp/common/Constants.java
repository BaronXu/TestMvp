package com.m4399.testmvp.common;

/**
 * 常量配置类
 *
 * @author 徐智伟
 * @create 15/9/1
 */
public final class Constants {


    public final class ExtraMsg{
        public static final String EXTRA_USERNAME = "extra_username";
    }

    public final class Integer{
        public static final int REQUEST_CODE = 0;
    }


    public  final class Urls{
        public static final String URL_ENDPOINT = "http://www.foo.com";
    }


    /**
     * 枚举
     */
    public enum Emun_Response{
        SUCCESS(0),ERROR(1);

        int code;
        private Emun_Response(int code){
            this.code = code;
        }
    }

}
