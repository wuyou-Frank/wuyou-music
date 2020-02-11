package com.service.impl;

import com.dao.CommentreplyDao;
import com.entity.CommentreplyEntity;
import com.service.CommentreplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentreplyServiceImpl implements CommentreplyService {
    @Autowired
    private CommentreplyDao commentreplyDao;
    @Override
    public List<CommentreplyEntity> getAll(int commenterid) {
        return commentreplyDao.getAll(commenterid);
    }
}
