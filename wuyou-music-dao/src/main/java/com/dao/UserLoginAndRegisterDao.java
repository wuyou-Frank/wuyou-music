package com.dao;

import com.entity.UserLoginAndRegisterEntity;

import java.util.List;

public interface UserLoginAndRegisterDao {
    List<UserLoginAndRegisterEntity> getAll();
    void delete(int id);
    void insert(UserLoginAndRegisterEntity userLoginAndRegisterEntity);
    void update(UserLoginAndRegisterEntity userLoginAndRegisterEntity);
}
