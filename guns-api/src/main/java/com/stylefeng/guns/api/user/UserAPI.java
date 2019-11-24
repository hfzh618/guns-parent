package com.stylefeng.guns.api.user;

/**
 * Created by hufangzhou on 2019/11/24.
 * 测试接口
 */

public interface UserAPI  {
    int login(String username, String password);
    boolean register(UserModel userModel);
    boolean checkUsername(String username);
    UserInfoModel getUserInfo(int uuid);
    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
}
