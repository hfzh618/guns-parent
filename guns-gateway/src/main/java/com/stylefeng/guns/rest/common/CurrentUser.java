package com.stylefeng.guns.rest.common;

/**
 * Created by hufangzhou on 2019/11/25.
 */
public class CurrentUser {
    //线程绑定的存储空间
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    //将用户信息放入存储空间
    public static void saveUserId(String  userId){
        threadLocal.set(userId);
    }

    //将用户信息取出
    public static String  getCurrentUser(){
        return threadLocal.get();
    }
}
