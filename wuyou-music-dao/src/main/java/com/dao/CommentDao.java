package com.dao;

import com.entity.CommentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    List<CommentEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize,@Param("slid") int slid);
}
