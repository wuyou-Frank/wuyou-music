package com.dao;

import com.entity.CommunityEntity;

import java.util.List;

public interface CommunityDao {
    List<CommunityEntity> getAll();
    void delete(int id);
    void update(CommunityEntity communityEntity);
    void insert(CommunityEntity communityEntity);
    void deleteClassficationId(int id);
}
