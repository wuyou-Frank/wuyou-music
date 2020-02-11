package com.service;

import com.entity.UserLoginAndRegisterEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserLoginAndRegisterService {
    List<UserLoginAndRegisterEntity> getAll();
    void delete(int id);
    void insert(UserLoginAndRegisterEntity userLoginAndRegisterEntity);
    void update(UserLoginAndRegisterEntity userLoginAndRegisterEntity);
}
