package com.service.impl;

import com.dao.ClassificationDao;
import com.entity.ClassificationEntity;
import com.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassificationServiceImpl implements ClassificationService {
    @Autowired
    private ClassificationDao classificationDao;
    @Override
    public List<ClassificationEntity> getAllPage(int pageNum,int pageSize) {
        return classificationDao.getAllPage(pageNum,pageSize);
    }
    @Override
    public List<ClassificationEntity> getAll() {
        return classificationDao.getAll();
    }

    @Override
    public void insert(ClassificationEntity classificationEntity) {
        classificationDao.insert(classificationEntity);
    }

    @Override
    public void delete(int id) {
        classificationDao.delete(id);
    }

    @Override
    public void update(ClassificationEntity classificationEntity) {
        classificationDao.update(classificationEntity);
    }
}
