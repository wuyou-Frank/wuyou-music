package com.dao;

import com.entity.AdminloginAndRegisterEntity;

import java.util.List;

public interface AdminloginAndRegisterDao {
    List<AdminloginAndRegisterEntity> getAll();
    void delete(int id);
    void insert(AdminloginAndRegisterEntity adminloginEntity);
    void update(AdminloginAndRegisterEntity adminloginEntity);
}
