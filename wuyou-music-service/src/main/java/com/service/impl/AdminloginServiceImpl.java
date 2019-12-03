package com.service.impl;

import com.dao.AdminloginDao;
import com.entity.AdminloginEntity;
import com.service.AdminloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminloginServiceImpl implements AdminloginService {

    @Autowired
    private AdminloginDao adminloginDao;

    @Override
    public List<AdminloginEntity> getAll(int pageNum, int pageSize) {
        return adminloginDao.getAll(pageNum,pageSize);
    }

    @Override
    public void insert(AdminloginEntity adminloginEntity) {
        adminloginDao.insert(adminloginEntity);
    }

    @Override
    public void delete(int id) {
        adminloginDao.delete(id);
    }

    @Override
    public void update(AdminloginEntity adminloginEntity) {
        adminloginDao.update(adminloginEntity);
    }
}
