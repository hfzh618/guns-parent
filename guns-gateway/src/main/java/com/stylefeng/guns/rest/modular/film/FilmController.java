package com.stylefeng.guns.rest.modular.film;

import com.stylefeng.guns.rest.modular.film.vo.BannerVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hufangzhou on 2019/11/25.
 */
@RestController
@RequestMapping("/film/")
public class FilmController {

    //获取首页信息接口
    /**
     * API网关
     * 1.功能聚合[API聚合] 好处 1。六个接口 一次请求 2，同一个请求对外暴露，降低了前后端分离开发的难度
     * 坏处： 1.一次获取数据过多，容易出现问题
     *
     * */
    @RequestMapping(value = "getIndex",method = RequestMethod.GET)
    public ResponseVO getIndex(){
        //获取banner信息
        BannerVO bannerVO = new BannerVO();
        //获取正在热映的电影
        //获取即将上映的电影
        //票房排行榜
        //获取受欢迎榜单
        //获取前一百
        return null;
    }
}
