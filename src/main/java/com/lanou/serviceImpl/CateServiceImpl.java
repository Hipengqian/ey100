package com.lanou.serviceImpl;

import com.lanou.dao.CateMapper;
import com.lanou.model.Cate;
import com.lanou.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */
@Service("cateService")
class CateServiceImpl implements CateService{
    @Autowired
    private CateMapper cateMapper;

    // 通过parentId找到对应的下一级分类集合
    public List<Cate> findByParentId(Integer parentId) {
       List<Cate> list = cateMapper.findByParentId(parentId);
       for (int i = 0; i < list.size(); i++){
           Cate cate = list.get(i);
           List<Cate> cateList = findByParentId(cate.getCategoryid());
           cate.setList(cateList);
       }
        return list;
    }
}
