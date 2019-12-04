package com.dao;

import com.entity.SongListEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongListDao {
    List<SongListEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize,@Param("id") int id);
    SongListEntity getById(int id);
    void insert(SongListEntity songListEntity);
    void update(SongListEntity songListEntity);
    void delete(int id);

}
