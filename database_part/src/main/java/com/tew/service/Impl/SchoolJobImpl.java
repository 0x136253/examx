package com.tew.service.Impl;


import com.tew.dao.SchoolJobMapper;
import com.tew.dao.SchoolMapper;
import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;
import com.tew.pojo.SchoolJob;
import com.tew.pojo.SchoolJobExample;
import com.tew.service.SchoolDAO;
import com.tew.service.SchoolJobDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("schoolJobDAO")
public class SchoolJobImpl implements SchoolJobDAO {
    @Autowired
    private SchoolJobMapper schoolJobMapper;

    @Override
    public int deleteByPrimaryKey(Short schoolTheJobid) {
        return schoolJobMapper.deleteByPrimaryKey(schoolTheJobid);
    }

    @Override
    public int insert(SchoolJob record) {
        return schoolJobMapper.insert(record);
    }

    @Override
    public int insertSelective(SchoolJob record) {
        return schoolJobMapper.insertSelective(record);
    }

    @Override
    public List<SchoolJob> selectByExample(SchoolJobExample example) {
        return schoolJobMapper.selectByExample(example);
    }

    @Override
    public SchoolJob selectByPrimaryKey(Short schoolTheJobid) {
        return schoolJobMapper.selectByPrimaryKey(schoolTheJobid);
    }

    @Override
    public int updateByPrimaryKeySelective(SchoolJob record) {
        return schoolJobMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SchoolJob record) {
        return schoolJobMapper.updateByPrimaryKey(record);
    }
}
