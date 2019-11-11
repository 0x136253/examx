package com.tew.service.Impl;

import com.tew.dao.ResBasMapper;
import com.tew.pojo.ResBas;
import com.tew.pojo.ResBasExample;
import com.tew.service.ResBasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("resBasDAO")
public class ResBasDAOImpl implements ResBasDAO {
    @Autowired
    private ResBasMapper resBasMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return resBasMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ResBas record) {
        return resBasMapper.insert(record);
    }

    @Override
    public int insertSelective(ResBas record) {
        return resBasMapper.insertSelective(record);
    }

    @Override
    public List<ResBas> selectByExample(ResBasExample example) {
        return resBasMapper.selectByExample(example);
    }

    @Override
    public ResBas selectByPrimaryKey(String id) {
        return resBasMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ResBas record) {
        return resBasMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ResBas record) {
        return resBasMapper.updateByPrimaryKey(record);
    }
}
