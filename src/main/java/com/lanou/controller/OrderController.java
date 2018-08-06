package com.lanou.controller;

import Util.ServerResponse;
import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.lanou.model.Consignee;
import com.lanou.model.User;
import com.lanou.service.ConsigneeService;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by peng on 2018/8/4.
 */
@Controller
public class OrderController {
    @Autowired
    private UserService userService;
    @Autowired
    private ConsigneeService consigneeService;

    public ServerResponse updateCon(Consignee consignee){
        Integer integer = consigneeService.updateCon(consignee);
        if (integer != 0){
            return ServerResponse.createSuccess(1,integer);
        }else{
            return ServerResponse.createError(0,"插入失败");
        }
    }


    @RequestMapping(value = "/findUserCon")
    @ResponseBody
    public ServerResponse findUserCon(Consignee consignee){
        List list = userService.findUserCon();
        if (list.size() != 0){
            return ServerResponse.createSuccess(1,list);
        }else{
            ServerResponse serverResponse = updateCon(consignee);
            return ServerResponse.createSuccess(1,serverResponse);
        }
    }
}
