package com.service;

import com.entity.ClassificationEntity;

import java.util.List;

public interface ClassificationService {
    List<ClassificationEntity> getAllPage(int pageNum,int pageSize);
    List<ClassificationEntity> getAll();
    void insert(ClassificationEntity classificationEntity);
    void delete(int id);
    void update(ClassificationEntity classificationEntity);
}
