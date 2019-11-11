package com.tew.service.Impl;

import com.tew.dao.ResHorMapper;
import com.tew.dao.ResJobMapper;
import com.tew.pojo.ResHor;
import com.tew.pojo.ResHorExample;
import com.tew.pojo.ResJob;
import com.tew.pojo.ResJobExample;
import com.tew.service.ResJobDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("resJobDAO")
public class ResJobDAOImpl implements ResJobDAO {
    @Autowired
    private ResJobMapper resJobMapper;

    @Override
    public int deleteByPrimaryKey(Short idJob) {
        return resJobMapper.deleteByPrimaryKey(idJob);
    }

    @Override
    public int insert(ResJob record) {
        return resJobMapper.insert(record);
    }

    @Override
    public int insertSelective(ResJob record) {
        return resJobMapper.insertSelective(record);
    }

    @Override
    public List<ResJob> selectByExample(ResJobExample example) {
        return resJobMapper.selectByExample(example);
    }

    @Override
    public ResJob selectByPrimaryKey(Short idJob) {
        return resJobMapper.selectByPrimaryKey(idJob);
    }

    @Override
    public int updateByPrimaryKeySelective(ResJob record) {
        return resJobMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ResJob record) {
        return resJobMapper.updateByPrimaryKey(record);
    }
}
