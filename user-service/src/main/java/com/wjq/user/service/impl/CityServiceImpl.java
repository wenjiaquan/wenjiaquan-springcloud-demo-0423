package com.wjq.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjq.user.entity.City;
import com.wjq.user.entity.CityVo;
import com.wjq.user.mapper.CityMapper;
import com.wjq.user.service.ICityService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wjq
 * @since 2020-04-25
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

    @Override
    public List<CityVo> findAll() {
        return baseMapper.findAll();
    }
}
