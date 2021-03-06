package com.dao;

import com.entity.SongListEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SongListDao {
    List<SongListEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize,@Param("id") int id);
    SongListEntity getById(int id);
    List<SongListEntity> getByName(@Param("pageNum")int pageNum,@Param("pageSize") int pageSize, @Param("name") String name);
    SongListEntity getSong(@Param("slname") String slname,@Param("sname") String sname,@Param("slid" ) int slid);
    void insert(SongListEntity songListEntity);
    void update(SongListEntity songListEntity);
    void delete(int id);
}
