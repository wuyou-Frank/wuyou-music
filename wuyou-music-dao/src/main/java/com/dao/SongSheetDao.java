package com.dao;

import com.entity.SongSheetEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongSheetDao {
    List<SongSheetEntity> getAllById(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize,@Param("id") int id);
    List<SongSheetEntity> getAll();
    void delete(int id);
    void update(SongSheetEntity songSheetEntity);
    void insert(SongSheetEntity songSheetEntity);
}
