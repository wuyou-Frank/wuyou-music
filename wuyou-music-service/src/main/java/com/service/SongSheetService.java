package com.service;

import com.entity.SongSheetEntity;

import java.util.List;

public interface SongSheetService {
    List<SongSheetEntity> getAllById(int pageNum , int pageSize,int id);
    List<SongSheetEntity> getAll();
    void update(SongSheetEntity songSheetEntity);
    void delete(int id);
    void insert(SongSheetEntity songSheetEntity);
}
