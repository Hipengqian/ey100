package com.lanou.serviceImpl;

import com.lanou.dao.OfficeMapper;
import com.lanou.model.Office;
import com.lanou.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peng on 2018/8/1.
 */
@Service
public class OfficeServiceImpl implements OfficeService {
    @Autowired
    private OfficeMapper officeMapper;

    public List<Office> findOffice(Office office) {
        return officeMapper.findOffice(office);
    }
}
