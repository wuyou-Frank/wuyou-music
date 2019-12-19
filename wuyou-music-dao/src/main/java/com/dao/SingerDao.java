package com.dao;

import com.entity.SingerEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SingerDao {
    List<SingerEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    List<SingerEntity> getByName(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize,@Param("name") String name);
    SingerEntity getByName2(String name);
}
