package org.lyy.dao;

import org.lyy.entity.User;

import java.util.List;

public interface UserDao {

    public void insertUser(User user);

    public List<User> queryAll();
}