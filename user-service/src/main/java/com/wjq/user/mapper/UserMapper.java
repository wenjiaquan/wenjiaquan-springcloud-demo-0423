package com.wjq.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wjq.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wjq
 * @since 2020-04-23
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<User> findAll(Page<User> page, User u);
}
