package com.stylefeng.guns.rest.modular;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.user.UserAPI;
import org.springframework.stereotype.Component;

/**
 * Created by hufangzhou on 2019/11/25.
 */
@Component
public class client {

    @Reference(interfaceClass = UserAPI.class)
    private UserAPI userAPI;

}
