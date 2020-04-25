package com.wjq.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjq.user.entity.User;
import com.wjq.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wjq
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("list")
    public IPage<User> list(@RequestParam(defaultValue = "1") Integer current,@RequestParam(defaultValue = "3") Integer size, User u){
        Page<User> page = new Page<>(current,size);
        System.err.println(u);
        return iUserService.findAll(page,u);
    }

    @PostMapping("add")
    public Object add(@RequestBody User u){
        return iUserService.save(u);
    }

    @PostMapping("update")
    public Object update(@RequestBody User u){
        return iUserService.updateById(u);
    }

    @PostMapping("delete")
    public Object update(Integer[] ids){
        boolean b=true;
        if(ids!=null){
            for(Integer id:ids){
                b = iUserService.removeById(id);
            }
        }
        return b;
    }
}

