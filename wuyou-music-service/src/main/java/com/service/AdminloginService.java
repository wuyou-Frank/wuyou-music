package com.service;

import com.entity.AdminloginEntity;

import java.util.List;

public interface AdminloginService {
    List<AdminloginEntity> getAll(int pageNum,int pageSize);
    void insert(AdminloginEntity adminloginEntity);
    void delete(int id);
    void update(AdminloginEntity adminloginEntity);
}
