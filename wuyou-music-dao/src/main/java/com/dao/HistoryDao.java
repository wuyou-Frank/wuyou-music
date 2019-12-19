package com.dao;

import com.entity.HistoryEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryDao {
    List<HistoryEntity> getAll(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    void delete(int id);
    void update(HistoryEntity historyEntity);
    void insert(HistoryEntity historyEntity);

}
