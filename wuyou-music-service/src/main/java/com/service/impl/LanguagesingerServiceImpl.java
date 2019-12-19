package com.service.impl;

import com.dao.LanguagesingerDao;
import com.entity.LanguagesingerEntity;
import com.service.LanguagesingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguagesingerServiceImpl implements LanguagesingerService {
    @Autowired
    private LanguagesingerDao languagesingerDao;
    @Override
    public List<LanguagesingerEntity> getAll() {
        return languagesingerDao.getAll();
    }
}
