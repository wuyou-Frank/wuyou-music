package com.dao;

import com.entity.CommentreplyEntity;

import java.util.List;

public interface CommentreplyDao {
    List<CommentreplyEntity> getAll(int commentid);
}
