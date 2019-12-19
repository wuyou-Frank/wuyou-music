package com.service.impl;

import com.dao.SingerDao;
import com.entity.SingerEntity;
import com.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SingerServiceImpl implements SingerService {
    @Autowired
    private SingerDao singerDao;
    @Override
    public List<SingerEntity> getAll(int pageNum, int pageSize) {
        return singerDao.getAll(pageNum,pageSize);
    }

    @Override
    public List<SingerEntity> getByName(int pageNum,int pageSize,String name) {
        return singerDao.getByName(pageNum,pageSize,name);
    }

    @Override
    public SingerEntity getByName2(String name) {
        return singerDao.getByName2(name);
    }
}
