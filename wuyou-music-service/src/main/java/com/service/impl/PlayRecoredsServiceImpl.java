package com.service.impl;

import com.dao.PlayRecoredsDao;
import com.dao.SongListDao;
import com.entity.PlayRecoredsEntity;
import com.entity.SongListEntity;
import com.service.PlayRecoredsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PlayRecoredsServiceImpl implements PlayRecoredsService {
    @Autowired
    private PlayRecoredsDao playRecoredsDao;
    @Autowired
    private SongListDao songListDao;

    @Override
    public List<PlayRecoredsEntity> getAll(int pageNum,int pageSize) {
        return playRecoredsDao.getAll(pageNum,pageSize);
    }

    @Override
    public void delete(int id) {
        playRecoredsDao.delete(id);
    }

    @Override
    public void update(PlayRecoredsEntity playRecoredsEntity) {
        playRecoredsDao.update(playRecoredsEntity);
    }

    @Override
    public void insert(PlayRecoredsEntity playRecoredsEntity) {
        playRecoredsDao.insert(playRecoredsEntity);
    }
    @Override
    @Transactional
    public void playRecoredsTx(int id){
        SongListEntity result = songListDao.getById(id);
        PlayRecoredsEntity entity = new PlayRecoredsEntity();
        entity.setPname(result.getSlname());
        entity.setPsinger(result.getSlinger());
        entity.setPalbum(result.getSlalbum());
        entity.setPsongAddress(result.getSlsongAddress());
        entity.setPimgAddress(result.getSlimgAddress());
        playRecoredsDao.insert(entity);
    }


}
