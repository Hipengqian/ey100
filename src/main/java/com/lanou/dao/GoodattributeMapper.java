package com.lanou.dao;

import com.lanou.model.Goodattribute;

import java.util.List;

public interface GoodattributeMapper {
    int deleteByPrimaryKey(Integer gaid);

    int insert(Goodattribute record);

    int insertSelective(Goodattribute record);

    Goodattribute selectByPrimaryKey(Integer gaid);

    int updateByPrimaryKeySelective(Goodattribute record);

    int updateByPrimaryKey(Goodattribute record);

    List<Goodattribute> findAttribute();
}