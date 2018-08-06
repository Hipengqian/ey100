package com.lanou.controller;

import Util.ServerResponse;
import com.lanou.model.Goods;
import com.lanou.model.OffGoods;
import com.lanou.model.Office;
import com.lanou.service.GoodService;
import com.lanou.service.OffGoodsService;
import com.lanou.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng on 2018/8/1.
 */
@Controller
public class OfficeController {
    @Autowired
    private GoodService goodService;

    @Autowired
    private OfficeService officeService;

    @Autowired
    public OffGoodsService offGoodsService;

    // goods表和offgoods连表查询
    public List findOffGoods(){
        List  lists = offGoodsService.findOffGoods();
        return  lists;
    }
    // 查询goods表中的商品
    public Goods findGoods(Goods goods) {
        Goods good = goodService.findGoods(goods.getGproductid());
        return good;
    }


    @RequestMapping(value = "/findOffice")
    @ResponseBody
    public ServerResponse findOffice(Office office, OffGoods offGoods) {
        List list = new ArrayList();
        List list2 = new ArrayList();

        List<Office> officeList = officeService.findOffice(office);
        List<OffGoods> offGoods1 = findOffGoods();
        if (offGoods1 != null) {
            list2.add(offGoods1);
            list.addAll(list2);
            if (officeList != null){
                list.addAll(officeList);
            return  ServerResponse.createSuccess(1,list);
            }else {
                return ServerResponse.createError(0, "查询失败");
            }
        } else{
            return ServerResponse.createError(0, "查询失败");
        }
    }
}
