package com.wjq.user.entity;

import lombok.Data;

import java.util.List;

@Data
public class CityVo {
    private Integer id;
    private String name;
    private List<CityVo> list;
}
