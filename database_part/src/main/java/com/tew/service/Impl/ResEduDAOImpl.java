package com.tew.service.Impl;

import com.tew.dao.ResBasMapper;
import com.tew.dao.ResEduMapper;
import com.tew.pojo.ResBas;
import com.tew.pojo.ResBasExample;
import com.tew.pojo.ResEdu;
import com.tew.pojo.ResEduExample;
import com.tew.service.ResEduDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("resEduDAO")
public class ResEduDAOImpl implements ResEduDAO {
    @Autowired
    private ResEduMapper resEduMapper;

    @Override
    public int deleteByPrimaryKey(Short idEdu) {
        return resEduMapper.deleteByPrimaryKey(idEdu);
    }

    @Override
    public int insert(ResEdu record) {
        return resEduMapper.insert(record);
    }

    @Override
    public int insertSelective(ResEdu record) {
        return resEduMapper.insertSelective(record);
    }

    @Override
    public List<ResEdu> selectByExample(ResEduExample example) {
        return resEduMapper.selectByExample(example);
    }

    @Override
    public ResEdu selectByPrimaryKey(Short idEdu) {
        return resEduMapper.selectByPrimaryKey(idEdu);
    }

    @Override
    public int updateByPrimaryKeySelective(ResEdu record) {
        return resEduMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ResEdu record) {
        return resEduMapper.updateByPrimaryKey(record);
    }
}
