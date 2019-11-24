package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;

/**
 * Created by hufangzhou on 2019/11/24.
 * 测试实现类
 */
@Component
@Service(interfaceClass = UserAPI.class )
public class UserImpl implements UserAPI {
    @Override
    public boolean login(String username, String password) {
        return true;
    }
}
