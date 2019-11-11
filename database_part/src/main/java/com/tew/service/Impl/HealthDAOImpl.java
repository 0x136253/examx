package com.tew.service.Impl;

import com.tew.dao.HealthMapper;
import com.tew.pojo.Health;
import com.tew.pojo.HealthExample;
import com.tew.service.HealthDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("healthDAO")
public class HealthDAOImpl implements HealthDAO {
    @Autowired
    private HealthMapper healthMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return healthMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Health record) {
        return healthMapper.insert(record);
    }

    @Override
    public int insertSelective(Health record) {
        return healthMapper.insertSelective(record);
    }

    @Override
    public List<Health> selectByExample(HealthExample example) {
        return healthMapper.selectByExample(example);
    }

    @Override
    public Health selectByPrimaryKey(String id) {
        return healthMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Health record) {
        return healthMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Health record) {
        return healthMapper.updateByPrimaryKey(record);
    }
}
