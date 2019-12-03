package com.service.impl;

import com.dao.CommunityDao;
import com.entity.CommunityEntity;
import com.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityDao communityDao;
    @Override
    public List<CommunityEntity> getAll() {
        return communityDao.getAll();
    }

    @Override
    public void insert(CommunityEntity communityEntity) {
        communityDao.insert(communityEntity);
    }

    @Override
    public void update(CommunityEntity communityEntity) {
        communityDao.update(communityEntity);
    }

    @Override
    public void delete(int id) {
        communityDao.delete(id);
    }
}
