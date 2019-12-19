package com.service;

import com.entity.SingerEntity;

import java.util.List;

public interface SingerService {
    List<SingerEntity> getAll(int pageNum,int pageSize);
    List<SingerEntity> getByName(int pageNum,int pageSize,String name);
    SingerEntity getByName2(String name);
}
