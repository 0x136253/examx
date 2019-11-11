package com.tew.service.Impl;

import com.tew.pojo.Extest;
import com.tew.pojo.ExtestExample;
import com.tew.service.ExpermissService;
import com.tew.service.ExtestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("expermissService")
public class ExpermissServiceImpl implements ExpermissService {
    @Autowired
    private ExtestDAO extestDAO;

    @Override
    public int deleteByPrimaryKey(String id) {
        return extestDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Extest record) {
        return extestDAO.insert(record);
    }

    @Override
    public int insertSelective(Extest record) {
        return extestDAO.insertSelective(record);
    }

    @Override
    public List<Extest> selectByExample(ExtestExample example) {
        return extestDAO.selectByExample(example);
    }

    @Override
    public Extest selectByPrimaryKey(String id) {
        return extestDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Extest record) {
        return extestDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Extest record) {
        return extestDAO.updateByPrimaryKey(record);
    }
}
