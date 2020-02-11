package com.service;

import com.entity.AdminloginAndRegisterEntity;

import java.util.List;

public interface AdminLoginAndRegisterService {
    List<AdminloginAndRegisterEntity> getAll();
    void insert(AdminloginAndRegisterEntity entity);
    void delete(int id);
    void update(AdminloginAndRegisterEntity entity);
}
