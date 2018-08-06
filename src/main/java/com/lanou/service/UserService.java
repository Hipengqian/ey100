package com.lanou.service;

import com.lanou.model.User;

import java.util.List;

/**
 * Created by lanou on 2018/7/28.
 */
public interface UserService {

   public User login(User user);


   public  User findUser(String email);

   public  int regist(User user);

    List findUserCon();
}
