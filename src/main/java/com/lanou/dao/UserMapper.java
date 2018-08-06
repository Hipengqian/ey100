package com.lanou.dao;

import com.lanou.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    public  User login(User user);
    public User findUser(String email);

    public int regist(User user);

    List findUserCon();
}