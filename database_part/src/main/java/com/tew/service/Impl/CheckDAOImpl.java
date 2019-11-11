package com.tew.service.Impl;


import com.tew.dao.CheckMapper;
import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;
import com.tew.service.CheckDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("checkDAO")
public class CheckDAOImpl implements CheckDAO {
    @Autowired
    private CheckMapper checkMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return checkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Check record) {
        return checkMapper.insert(record);
    }

    @Override
    public int insertSelective(Check record) {
        return checkMapper.insertSelective(record);
    }

    @Override
    public List<Check> selectByExample(CheckExample example) {
        return checkMapper.selectByExample(example);
    }

    @Override
    public Check selectByPrimaryKey(String id) {
        return checkMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Check record, CheckExample example) {
        return checkMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Check record, CheckExample example) {
        return checkMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Check record) {
        return checkMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Check record) {
        return checkMapper.updateByPrimaryKey(record);
    }
}
