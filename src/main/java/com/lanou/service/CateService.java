package com.lanou.service;

import com.lanou.model.Cate;

import java.util.List;

/**
 * Created by peng on 2018/7/30.
 */
public interface CateService {

    List<Cate> findByParentId(Integer parentId);
}
