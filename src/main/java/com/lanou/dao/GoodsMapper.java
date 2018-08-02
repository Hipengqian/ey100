package com.lanou.dao;

import com.lanou.model.Goodattribute;
import com.lanou.model.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    List<Goods> findList(String goodattribute);

    Goods findGoods(String gproductid);
}