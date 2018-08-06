package com.lanou.dao;

import com.lanou.model.Consignee;

public interface ConsigneeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    Consignee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);

    Consignee updateCon(Consignee consignee);
}