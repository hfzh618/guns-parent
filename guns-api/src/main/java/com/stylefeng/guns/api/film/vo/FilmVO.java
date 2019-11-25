package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hufangzhou on 2019/11/25.
 */
@Data
public class FilmVO implements Serializable {
    private int filmNum;
    private List<FilmInfo> filmInfo;
}
