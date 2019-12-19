package com.service;

import com.entity.HistoryEntity;

import java.util.List;

public interface HistoryService {
    List<HistoryEntity> getAll(int pageNum, int pageSize);
    void delete(int id);
    void update(HistoryEntity historyEntity);
    void insert(HistoryEntity historyEntity);
    void playRecoredsTx(int id);
}
