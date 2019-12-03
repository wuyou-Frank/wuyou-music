package com.dao;

import com.entity.AdminloginEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminloginDao {
    List<AdminloginEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    void delete(int id);
    void insert(AdminloginEntity adminloginEntity);
    void update(AdminloginEntity adminloginEntity);
}
