package com.service.impl;

import com.dao.LanguageDao;
import com.entity.LanguageEntity;
import com.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageServiceImpl implements LanguageService {
    @Autowired
    private LanguageDao languageDao;
    @Override
    public List<LanguageEntity> getAll() {
        return languageDao.getAll();
    }
}
