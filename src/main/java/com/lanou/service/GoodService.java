package com.lanou.service;

import com.lanou.model.Cate;
import com.lanou.model.Goodattribute;
import com.lanou.model.Goods;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */

public interface GoodService {
    public List<Goods> findList(Cate cate);

    public List<Goodattribute> findAttribute();

    List<Goods> findGoodMessage(String productId);
    public List<String> findAttribute(String goodattribute);

    Goods findGoods(String gproductid);
}
