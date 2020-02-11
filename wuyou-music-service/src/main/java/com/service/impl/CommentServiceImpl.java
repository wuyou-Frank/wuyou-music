package com.service.impl;

import com.dao.CommentDao;
import com.entity.CommentEntity;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Override
    public List<CommentEntity> getAll(int pageNum, int pageSize, int slid) {
        return commentDao.getAll(pageNum,pageSize,slid);
    }
}
