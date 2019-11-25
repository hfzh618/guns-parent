package com.stylefeng.guns.api.user;

import com.stylefeng.guns.api.user.vo.UserInfoModel;
import com.stylefeng.guns.api.user.vo.UserModel;

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
