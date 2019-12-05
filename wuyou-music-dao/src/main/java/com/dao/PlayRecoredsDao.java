package com.dao;

import com.entity.PlayRecoredsEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayRecoredsDao {
    List<PlayRecoredsEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    void delete(int id);
    void update(PlayRecoredsEntity playRecoredsEntity);
    void insert(PlayRecoredsEntity playRecoredsEntity);

}
