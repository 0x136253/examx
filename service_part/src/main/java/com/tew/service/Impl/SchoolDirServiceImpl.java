package com.tew.service.Impl;


import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;
import com.tew.service.SchoolDAO;
import com.tew.service.SchoolDirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("schoolDirService")
public class SchoolDirServiceImpl implements SchoolDirService {
    @Autowired
    private SchoolDAO schoolDAO;

    @Override
    public int deleteByPrimaryKey(Short schoolid) {
        return schoolDAO.deleteByPrimaryKey(schoolid);
    }

    @Override
    public int insertSelective(School record) {
        return schoolDAO.insertSelective(record);
    }

    @Override
    public List<School> selectByExample(SchoolExample example) {
        return schoolDAO.selectByExample(example);
    }

    @Override
    public School selectByPrimaryKey(Short schoolid) {
        return schoolDAO.selectByPrimaryKey(schoolid);
    }

    @Override
    public int updateByPrimaryKeySelective(School record) {
        return schoolDAO.updateByPrimaryKeySelective(record);
    }
}
