package com.lanou.serviceImpl;

import com.lanou.dao.GoodattributeMapper;
import com.lanou.dao.GoodsMapper;
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

    public List<Goods> findList(Goodattribute goodattribute) {
        List<Goods> goodsList = goodsMapper.findList(goodattribute.getGabrand());
        return  goodsList;
    }

    public List<String> findAttribute(String goodattribute) {
        List<String> goodattributes = goodattributeMapper.findAttribute(goodattribute);
        return goodattributes;
    }
}
