package com.lanou.serviceImpl;

import com.lanou.dao.OffGoodsMapper;
import com.lanou.model.OffGoods;
import com.lanou.service.OffGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peng on 2018/8/2.
 */
@Service
public class OffGoodsServiceImpl implements OffGoodsService {
    @Autowired
    private OffGoodsMapper offGoodsMapper;

    public List findOffGoods() {
      return offGoodsMapper.findOffGoods();
    }
}
