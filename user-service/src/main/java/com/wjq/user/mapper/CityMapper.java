package com.wjq.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjq.user.entity.City;
import com.wjq.user.entity.CityVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wjq
 * @since 2020-04-25
 */
public interface CityMapper extends BaseMapper<City> {

    List<CityVo> findAll();
}
