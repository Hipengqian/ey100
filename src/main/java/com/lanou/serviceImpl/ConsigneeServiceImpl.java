package com.lanou.serviceImpl;

import com.lanou.dao.ConsigneeMapper;
import com.lanou.model.Consignee;
import com.lanou.service.ConsigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by peng on 2018/8/5.
 */
@Service
public class ConsigneeServiceImpl implements ConsigneeService{
    @Autowired
    private ConsigneeMapper consigneeMapper;

    public Integer updateCon(Consignee consignee) {
        int con = consigneeMapper.insertSelective(consignee);
        return con;
    }
}
