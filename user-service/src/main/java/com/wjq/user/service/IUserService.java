package com.wjq.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjq.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wjq
 * @since 2020-04-23
 */
public interface IUserService extends IService<User> {

    IPage<User> findAll(Page<User> page, User u);
}
