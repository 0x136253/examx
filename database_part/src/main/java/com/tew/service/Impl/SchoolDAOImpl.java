package com.tew.service.Impl;

import com.tew.dao.SchoolMapper;
import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;
import com.tew.service.SchoolDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("schoolDAO")
public class SchoolDAOImpl implements SchoolDAO {

    @Autowired
    private SchoolMapper schoolMapper;
    @Override
    public int deleteByPrimaryKey(Short schoolid) {
        return schoolMapper.deleteByPrimaryKey(schoolid);
    }

    @Override
    public int insert(School record) {
        return schoolMapper.insert(record);
    }

    @Override
    public int insertSelective(School record) {
        return schoolMapper.insertSelective(record);
    }

    @Override
    public List<School> selectByExample(SchoolExample example) {
        return schoolMapper.selectByExample(example);
    }

    @Override
    public School selectByPrimaryKey(Short schoolid) {
        return schoolMapper.selectByPrimaryKey(schoolid);
    }

    @Override
    public int updateByPrimaryKeySelective(School record) {
        return schoolMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(School record) {
        return schoolMapper.updateByPrimaryKey(record);
    }
}
