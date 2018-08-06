package com.lanou.controller;

import Util.ServerResponse;
import com.lanou.model.Cate;
import com.lanou.model.Goodattribute;
import com.lanou.model.Goods;
import com.lanou.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */
@Controller
@CrossOrigin
public class GoodController {
    //注入service层
    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/findList")
    @ResponseBody
    public ServerResponse findList(Cate cate) {
        List<Goods> goodList = goodService.findList(cate);
        System.out.println(goodList);
        if (goodList.size() != 0) {
            return ServerResponse.createSuccess(1, goodList);
        } else {
            return ServerResponse.createError(0, "查询失败");
        }
    }

    @RequestMapping(value = "/findGoodMessage")
    @ResponseBody

    public ServerResponse findGoodMessage(Goods goods) {
        List<Goods> goodMessages = goodService.findGoodMessage(goods.getGproductid());
        if (goodMessages.size() != 0) {
            return ServerResponse.createSuccess(1, goodMessages);
        } else {
            return ServerResponse.createError(0, "查询失败");
        }
    }

    @RequestMapping(value = "/findGoodattribute")
    @ResponseBody
    public ServerResponse findAttribute() {

        List<Goodattribute> goodattributes = goodService.findAttribute();
        HashSet<String> gabrandSet = new HashSet<String>();
        HashSet<String> gacolorSet = new HashSet<String>();
        HashSet<String> gasizeSet = new HashSet<String>();
        HashSet<String> gaweightSet = new HashSet<String>();
        HashSet<String> gaqualitySet = new HashSet<String>();

        for (int i = 0; i < goodattributes.size(); i++) {
            gabrandSet.add(goodattributes.get(i).getGabrand());
            gacolorSet.add(goodattributes.get(i).getGacolor());
            gasizeSet.add(goodattributes.get(i).getGasize());
            gaweightSet.add(goodattributes.get(i).getGaweight());
            gaqualitySet.add(goodattributes.get(i).getGaquality());
        }
        List list = new ArrayList();
        list.add(gabrandSet);
        list.add(gacolorSet);
        list.add(gasizeSet);
        list.add(gaweightSet);
        list.add(gaqualitySet);
        System.out.println(list);

        if (goodattributes.size() != 0) {
            return ServerResponse.createSuccess(1, list);
        } else {
            return ServerResponse.createError(0, "查询失败");
        }
    }

}
