package com.dao;

import com.entity.ClassificationEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassificationDao {
    List<ClassificationEntity> getAllPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    List<ClassificationEntity> getAll();
    void delete(int id);
    void insert(ClassificationEntity classificationEntity);
    void update(ClassificationEntity classificationEntity);
}
