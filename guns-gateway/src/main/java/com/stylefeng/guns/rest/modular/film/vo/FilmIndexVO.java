package com.stylefeng.guns.rest.modular.film.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by hufangzhou on 2019/11/25.
 */
@Data
public class FilmIndexVO {
    private List<BannerVO> banners;
    private FilmVO hotFilms;
    private FilmVO soonFilms;
    private List<FilmInfo> boxRanking;
    private List<FilmInfo> expectRanking;
    private List<FilmInfo> top100;

}
