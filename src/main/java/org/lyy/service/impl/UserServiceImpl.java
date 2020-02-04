package org.lyy.service.impl;

import org.lyy.entity.User;
import org.lyy.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public void insertUser(User user) {
        System.out.println("service插入数据");
    }

    @Override
    public List<User> queryAll() {
        System.out.println("service查询全部数据");
        return null;
    }
}