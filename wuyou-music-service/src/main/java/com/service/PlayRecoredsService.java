package com.service;

import com.entity.PlayRecoredsEntity;

import java.util.List;

public interface PlayRecoredsService {
    List<PlayRecoredsEntity> getAll(int pageNum,int pageSize);
    void delete(int id);
    void update(PlayRecoredsEntity playRecoredsEntity);
    void insert(PlayRecoredsEntity playRecoredsEntity);
    void playRecoredsTx(int id);
}
