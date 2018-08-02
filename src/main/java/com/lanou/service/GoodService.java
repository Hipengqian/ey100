package com.lanou.service;

import com.lanou.model.Goodattribute;
import com.lanou.model.Goods;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */

public interface GoodService {
    public List<Goods> findList(Goodattribute goodattribute);

    public List<String> findAttribute(String goodattribute);

    Goods findGoods(String gproductid);
}
