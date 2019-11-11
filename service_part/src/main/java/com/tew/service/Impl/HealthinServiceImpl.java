package com.tew.service.Impl;

import com.tew.pojo.Health;
import com.tew.pojo.HealthExample;
import com.tew.service.HealthDAO;
import com.tew.service.HealthinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("healthinService")
public class HealthinServiceImpl implements HealthinService {
    @Autowired
    private HealthDAO healthDAO;

    @Override
    public int deleteByPrimaryKey(String id) {
        return healthDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Health record) {
        return healthDAO.insert(record);
    }

    @Override
    public int insertSelective(Health record) {
        return healthDAO.insertSelective(record);
    }

    @Override
    public List<Health> selectByExample(HealthExample example) {
        return healthDAO.selectByExample(example);
    }

    @Override
    public Health selectByPrimaryKey(String id) {
        return healthDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Health record) {
        return healthDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Health record) {
        return healthDAO.updateByPrimaryKey(record);
    }
}
