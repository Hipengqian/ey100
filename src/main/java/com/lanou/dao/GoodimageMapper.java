package com.lanou.dao;

import com.lanou.model.Goodimage;

public interface GoodimageMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(Goodimage record);

    int insertSelective(Goodimage record);

    Goodimage selectByPrimaryKey(Integer iid);
    Goodimage selectByGId(Integer iid);

    int updateByPrimaryKeySelective(Goodimage record);

    int updateByPrimaryKey(Goodimage record);
}