package com.stylefeng.guns.rest.modular.film.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by hufangzhou on 2019/11/25.
 */
@Data
public class FilmVO {
    private int filmNum;
    private List<FilmInfo> filmInfo;
}
