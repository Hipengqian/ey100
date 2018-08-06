package com.lanou.serviceImpl;

import com.lanou.dao.GoodattributeMapper;
import com.lanou.dao.GoodsMapper;
import com.lanou.model.Cate;
import com.lanou.model.Goodattribute;
import com.lanou.model.Goods;
import com.lanou.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */
@Service("goodService")
 class GoodServiceImpl implements GoodService{
    @Autowired
    //注入dao层
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodattributeMapper goodattributeMapper;

    public List<Goods> findList(Cate cate) {
        List<Goods> goodsList = goodsMapper.findList(cate.getCategoryid());
        System.out.println(cate.getCategoryid());
        return  goodsList;
    }

    public List<Goodattribute> findAttribute() {
        List<Goodattribute> goodattributes = goodattributeMapper.findAttribute();
        return goodattributes;
    }

    public List<Goods> findGoodMessage(String productId) {
        List<Goods> goodMessages =  goodsMapper.findGoodMessage(productId);
        return goodMessages;
    }


    public Goods findGoods(String gproductid) {
        return  goodsMapper.findGoods(gproductid);
    }


}
