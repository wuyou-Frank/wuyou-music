package com.service;

import com.entity.CommentEntity;

import java.util.List;

public interface CommentService {
    List<CommentEntity> getAll(int pageNum, int pageSize, int slid);
}
