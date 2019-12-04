package com.service;

import com.entity.SongListEntity;

import java.util.List;

public interface SongListService {
    List<SongListEntity> getAll(int pageNum ,int pageSize,int id);
    SongListEntity getById(int id);
    void update(SongListEntity songListEntity);
    void insert(SongListEntity songListEntity);
    void delete(int id);
}
