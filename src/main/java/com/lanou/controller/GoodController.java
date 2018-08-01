package com.lanou.controller;

import Util.ServerResponse;
import com.lanou.model.Goodattribute;
import com.lanou.model.Goods;
import com.lanou.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */
@Controller
public class GoodController {
    //注入service层
    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/findList")
    @ResponseBody
    public ServerResponse findList(Goodattribute goodattribute){
         List<Goods> goodList =  goodService.findList(goodattribute);
         System.out.println(goodList);
         if(goodList.size()!=0){
             return  ServerResponse.createSuccess("查询成功",goodList);
         } else {
             return  ServerResponse.createError(0,"查询失败");
         }
    }

    @RequestMapping(value = "/findGoodattribute")
    @ResponseBody
    public ServerResponse findAttribute(String goodattribute){

       List<String> goodattributes = goodService.findAttribute(goodattribute);
        System.out.println(goodattributes);
       if (goodattributes.size() != 0){
           return  ServerResponse.createSuccess("查询成功",goodattributes);
       }else {
           return  ServerResponse.createError(0,"查询失败");
       }
    }

}







