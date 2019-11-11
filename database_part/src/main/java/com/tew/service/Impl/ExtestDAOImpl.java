package com.tew.service.Impl;

import com.tew.dao.ExtestMapper;
import com.tew.pojo.Extest;
import com.tew.pojo.ExtestExample;
import com.tew.service.ExtestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("extestDAO")
public class ExtestDAOImpl implements ExtestDAO {
    @Autowired
    private ExtestMapper extestMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return extestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Extest record) {
        return extestMapper.insert(record);
    }

    @Override
    public int insertSelective(Extest record) {
        return extestMapper.insertSelective(record);
    }

    @Override
    public List<Extest> selectByExample(ExtestExample example) {
        return extestMapper.selectByExample(example);
    }

    @Override
    public Extest selectByPrimaryKey(String id) {
        return extestMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Extest record) {
        return extestMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Extest record) {
        return extestMapper.updateByPrimaryKey(record);
    }
}
