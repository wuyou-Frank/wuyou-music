package com.service.impl;

import com.dao.UserLoginAndRegisterDao;
import com.entity.UserLoginAndRegisterEntity;
import com.service.UserLoginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserLoginAndRegisterServiceImpl implements UserLoginAndRegisterService {
    @Autowired
    private UserLoginAndRegisterDao userLoginAndRegisterDao;
    @Override
    public List<UserLoginAndRegisterEntity> getAll() {
        return userLoginAndRegisterDao.getAll();
    }

    @Override
    public void delete(int id) {
        userLoginAndRegisterDao.delete(id);
    }

    @Override
    public void insert(UserLoginAndRegisterEntity userLoginAndRegisterEntity) {
        userLoginAndRegisterDao.insert(userLoginAndRegisterEntity);
    }

    @Override
    public void update(UserLoginAndRegisterEntity userLoginAndRegisterEntity) {
        userLoginAndRegisterDao.update(userLoginAndRegisterEntity);
    }
}
