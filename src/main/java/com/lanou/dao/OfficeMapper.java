package com.lanou.dao;

import com.lanou.model.Office;

import java.util.List;

public interface OfficeMapper {
    int deleteByPrimaryKey(Integer osid);

    int insert(Office record);

    int insertSelective(Office record);

    Office selectByPrimaryKey(Integer osid);

    int updateByPrimaryKeySelective(Office record);

    int updateByPrimaryKey(Office record);
    public List<Office> findOffice(Office office);
}