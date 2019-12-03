package com.service;

import com.entity.CommunityEntity;

import java.util.List;


public interface CommunityService {
    List<CommunityEntity> getAll();
    void insert(CommunityEntity communityEntity);
    void update(CommunityEntity communityEntity);
    void delete(int id);
}
