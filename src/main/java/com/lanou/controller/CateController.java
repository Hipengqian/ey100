package com.lanou.controller;

import Util.ServerResponse;
import com.lanou.model.Cate;
import com.lanou.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */
@Controller
public class CateController {
    @Autowired
    private CateService cateService;
    @RequestMapping(value = "/findByParentId")
    @ResponseBody
    public ServerResponse findByParentId(Integer parentId){
       List<Cate> list = cateService.findByParentId(parentId);
       if (list.size() == 0){
           ServerResponse serverResponse = ServerResponse.createError(0, "查询无结果");
           return serverResponse;
       }else {
           ServerResponse serverResponse = ServerResponse.createSuccess("查询成功", list);
           return serverResponse;
       }
    }



}
