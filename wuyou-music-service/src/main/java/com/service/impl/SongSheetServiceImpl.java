package com.service.impl;

import com.dao.SongSheetDao;
import com.entity.SongSheetEntity;
import com.service.SongSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongSheetServiceImpl implements SongSheetService {
    @Autowired
    private SongSheetDao songSheetDao;
    @Override
    public List<SongSheetEntity> getAll(int pageNum, int pageSize,int id) {
        return songSheetDao.getAll(pageNum,pageSize,id);
    }

    @Override
    public void update(SongSheetEntity songSheetEntity) {
        songSheetDao.update(songSheetEntity);
    }

    @Override
    public void delete(int id) {
        songSheetDao.delete(id);
    }

    @Override
    public void insert(SongSheetEntity songSheetEntity) {
        songSheetDao.insert(songSheetEntity);
    }
}
