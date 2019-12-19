package com.service.impl;

import com.dao.HistoryDao;
import com.dao.SongListDao;
import com.entity.HistoryEntity;
import com.entity.SongListEntity;
import com.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryDao historyDao;
    @Autowired
    private SongListDao songListDao;

    @Override
    public List<HistoryEntity> getAll(int pageNum, int pageSize) {
        return historyDao.getAll(pageNum,pageSize);
    }

    @Override
    public void delete(int id) {
        historyDao.delete(id);
    }

    @Override
    public void update(HistoryEntity historyEntity) {
        historyDao.update(historyEntity);
    }

    @Override
    public void insert(HistoryEntity historyEntity) {
        historyDao.insert(historyEntity);
    }
    @Override
    @Transactional
    public void playRecoredsTx(int id){
        SongListEntity result = songListDao.getById(id);
        HistoryEntity entity = new HistoryEntity();
        entity.setHname(result.getSlname());
        entity.setHsinger(result.getSname());
        entity.setHalbum(result.getAname());
        entity.setHsongAddress(result.getSlsongAddress());
        entity.setHimgAddress(result.getSlimgAddress());
        historyDao.insert(entity);
    }


}
