package com.lanou.controller;

import Util.ServerResponse;
import com.lanou.model.User;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lanou on 2018/7/28.
 */
@Controller
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    //用户登录方法
    public ServerResponse login(User user, HttpServletRequest request) {

        //调用service层login方法
        User loginUser = userService.login(user);
        //登录判断
        if (loginUser != null) {
            //登录成功
            // 把用户信息存进session
            HttpSession requestSession = request.getSession(true );
            requestSession.setAttribute("userSession", loginUser);

            return ServerResponse.createSuccess(1, loginUser);
        } else {
            //登录失败
            return ServerResponse.createError(0, "登录失败");

        }

    }

    //查询用户
    public User findUser(User user) {
        //判断数据库是否有此人
        User user2 = userService.findUser(user.getEmail());
        return user2;
    }

    //注册用户
    @RequestMapping(value = "/regist")
    @ResponseBody
    public ServerResponse regist(User user) {
        //调用findUser方法
        System.out.println(user);
        User user1 = findUser(user);
        if (user1 == null) {
            int isRegist = userService.regist(user);
            if (isRegist != 0) {
                return ServerResponse.createSuccess(1, isRegist);
            }
        }
        return ServerResponse.createError(0, "注册失败");
    }

}







