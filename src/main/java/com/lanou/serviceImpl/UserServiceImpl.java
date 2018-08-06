package com.lanou.serviceImpl;

import com.lanou.dao.UserMapper;
import com.lanou.model.User;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lanou on 2018/7/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    public User login(User user) {
      return  userMapper.login(user);
    }

    public User findUser(String email) {
        return userMapper.findUser(email);
    }

    public int regist(User user) {
        return userMapper.regist(user);
    }

    public List findUserCon() {
        return userMapper.findUserCon();
    }


}
