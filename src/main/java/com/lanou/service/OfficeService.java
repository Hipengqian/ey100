package com.lanou.service;

import com.lanou.model.Office;

import java.util.List;

/**
 * Created by peng on 2018/8/1.
 */
public interface OfficeService {

    List<Office> findOffice(Office office);
}
