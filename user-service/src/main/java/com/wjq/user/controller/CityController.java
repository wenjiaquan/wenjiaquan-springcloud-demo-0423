package com.wjq.user.controller;


import com.wjq.user.entity.CityVo;
import com.wjq.user.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wjq
 * @since 2020-04-25
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService iCityService;

    @RequestMapping("findAll")
    public List<CityVo> findAll(){
        return iCityService.findAll();
    }
}

