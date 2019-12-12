package com.service.impl;

import com.dao.AdminloginAndRegisterDao;
import com.entity.AdminloginAndRegisterEntity;
import com.service.AdminloginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminloginAndRegisterServiceImpl implements AdminloginAndRegisterService {

    @Autowired
    private AdminloginAndRegisterDao adminloginAndRegisterDao;

    @Override
    public List<AdminloginAndRegisterEntity> getAll() {
        return adminloginAndRegisterDao.getAll();
    }

    @Override
    public void insert(AdminloginAndRegisterEntity adminloginEntity) {
        adminloginAndRegisterDao.insert(adminloginEntity);
    }

    @Override
    public void delete(int id) {
        adminloginAndRegisterDao.delete(id);
    }

    @Override
    public void update(AdminloginAndRegisterEntity adminloginEntity) {
        adminloginAndRegisterDao.update(adminloginEntity);
    }
}
