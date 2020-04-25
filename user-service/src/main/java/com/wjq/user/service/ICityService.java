package com.wjq.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjq.user.entity.City;
import com.wjq.user.entity.CityVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wjq
 * @since 2020-04-25
 */
public interface ICityService extends IService<City> {

    List<CityVo> findAll();
}
