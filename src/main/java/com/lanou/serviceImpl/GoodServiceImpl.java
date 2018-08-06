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
<<<<<<< HEAD
 class GoodServiceImpl implements GoodService{
=======
class GoodServiceImpl implements GoodService {
>>>>>>> 7ab66abdb8f845acfdd30ecc28e241cbeba125e6
    @Autowired
    //注入dao层
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodattributeMapper goodattributeMapper;

    public List<Goods> findList(Cate cate) {
        List<Goods> goodsList = goodsMapper.findList(cate.getCategoryid());
        System.out.println(cate.getCategoryid());
        return goodsList;
    }

    public List<Goodattribute> findAttribute() {
        List<Goodattribute> goodattributes = goodattributeMapper.findAttribute();
        return goodattributes;
    }

    public List<Goods> findGoodMessage(String productId) {
        List<Goods> goodMessages = goodsMapper.findGoodMessage(productId);
        return goodMessages;
    }

<<<<<<< HEAD

    public Goods findGoods(String gproductid) {
        return  goodsMapper.findGoods(gproductid);
=======
    public List<String> findAttribute(String goodattribute) {
        return null;
    }

    public Goods findGoods(String gproductid) {
        return goodsMapper.findGoods(gproductid);
>>>>>>> 7ab66abdb8f845acfdd30ecc28e241cbeba125e6
    }


}
