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
<<<<<<< HEAD
    List<Goods> findList(Integer cateid);
    List<Goods> findGoodMessage(String productId);
=======
    List<Goods> findList(String goodattribute);

    Goods findGoods(String gproductid);
>>>>>>> 60560d286c5d0539f41d9abc1622a6b57121558d
}