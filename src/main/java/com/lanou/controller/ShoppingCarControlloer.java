package com.lanou.controller;

import Util.ServerResponse;
import com.lanou.model.Goods;
import com.lanou.model.ShoppingCar;
import com.lanou.model.User;
import com.lanou.service.ShoppingCarService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lanou on 2018/8/3.
 */
@Controller
@CrossOrigin
public class ShoppingCarControlloer {
    @Autowired
    private ShoppingCarService shoppingCarService;

    @RequestMapping("/findShoppingCar")
    @ResponseBody
    public ServerResponse findShoppingCar(User user) {

        List<Goods> shoppingCar = shoppingCarService.findShoppingCar(user.getEmail());

        if (shoppingCar.size() == 0) {
            return ServerResponse.createError(0, "添加失败");
        } else {
            return ServerResponse.createSuccess(1, shoppingCar);
        }

    }


    @RequestMapping("/addShoppingCar")
    @ResponseBody

    public ServerResponse addShoppingCar(ShoppingCar shoppingCar, HttpServletRequest request) {

        //获取session

        HttpSession requestSession = request.getSession();

        User user = (User) requestSession.getAttribute("userSession");

        if (user != null) {
            //用户已经登录
            int b = shoppingCarService.insert(shoppingCar);

            if (b != 0) {
                return ServerResponse.createSuccess(1, findShoppingCar(user));
            }

            return ServerResponse.createError(0, "失败");

        } else {

            List<Goods> shoppingCar2 = shoppingCarService.findShoppingCarByProdeuctId(shoppingCar);

            if (shoppingCar2.size() == 0) {
                return ServerResponse.createError(0, "失败");
            } else {
                return ServerResponse.createSuccess(1, shoppingCar2);
            }
        }
    }
}
