package com.lanou.dao;

import com.lanou.model.Cate;

import java.util.List;

public interface CateMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(Cate record);

    int insertSelective(Cate record);

    Cate selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(Cate record);

    int updateByPrimaryKey(Cate record);

    List<Cate> findByParentId(Integer parentId);
}