package com.lanou.dao;

import com.lanou.model.OffGoods;

import java.util.List;

public interface OffGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OffGoods record);

    int insertSelective(OffGoods record);

    OffGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OffGoods record);

    int updateByPrimaryKey(OffGoods record);

    List findOffGoods();
}