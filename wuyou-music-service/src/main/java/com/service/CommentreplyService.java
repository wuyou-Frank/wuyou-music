package com.service;

import com.entity.CommentreplyEntity;

import java.util.List;

public interface CommentreplyService {
    List<CommentreplyEntity> getAll(int commenterid);
}
