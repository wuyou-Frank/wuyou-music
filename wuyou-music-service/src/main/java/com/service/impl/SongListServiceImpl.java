package com.service.impl;

import com.dao.SongListDao;
import com.entity.SongListEntity;
import com.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongListServiceImpl implements SongListService {
    @Autowired
    private SongListDao songListDao;
    @Override
    public List<SongListEntity> getAll(int pageNum, int pageSize,int id) {
        return songListDao.getAll(pageNum,pageSize,id);
    }
    @Override
    public SongListEntity getById(int id){
        return songListDao.getById(id);
    }

    @Override
    public List<SongListEntity> getByNmae(int pageNum,int pageSize,String name) {
        return songListDao.getByName(pageNum,pageSize,name);
    }

    @Override
    public SongListEntity getSong( String slname, String sname, int slid) {
        return songListDao.getSong( slname, sname, slid);
    }


    @Override
    public void update(SongListEntity songListEntity) {
        songListDao.update(songListEntity);
    }

    @Override
    public void insert(SongListEntity songListEntity) {
        songListDao.insert(songListEntity);
    }

    @Override
    public void delete(int id) {
        songListDao.delete(id);
    }
}
