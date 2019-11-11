package com.tew.service.Impl;

import com.tew.dao.ResEduMapper;
import com.tew.dao.ResHorMapper;
import com.tew.pojo.ResEdu;
import com.tew.pojo.ResEduExample;
import com.tew.pojo.ResHor;
import com.tew.pojo.ResHorExample;
import com.tew.service.ResHorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("resHorDAO")
public class ResHorDAOImpl implements ResHorDAO {
    @Autowired
    private ResHorMapper resHorMapper;

    @Override
    public int deleteByPrimaryKey(Short idHor) {
        return resHorMapper.deleteByPrimaryKey(idHor);
    }

    @Override
    public int insert(ResHor record) {
        return resHorMapper.insert(record);
    }

    @Override
    public int insertSelective(ResHor record) {
        return resHorMapper.insertSelective(record);
    }

    @Override
    public List<ResHor> selectByExample(ResHorExample example) {
        return resHorMapper.selectByExample(example);
    }

    @Override
    public ResHor selectByPrimaryKey(Short idHor) {
        return resHorMapper.selectByPrimaryKey(idHor);
    }

    @Override
    public int updateByPrimaryKeySelective(ResHor record) {
        return resHorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ResHor record) {
        return resHorMapper.updateByPrimaryKey(record);
    }
}
