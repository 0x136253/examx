package com.tew.service.Impl;

import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;
import com.tew.service.SchoolDirService;
import com.tew.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolSeviceImpl implements SchoolService {
    @Autowired
    private SchoolDirService schoolDirService;

    @Override
    public int deleteByPrimaryKey(Short schoolid) {
        return schoolDirService.deleteByPrimaryKey(schoolid);
    }

    @Override
    public int insertSelective(School record) {
        record.setSchoolid(null);
        return schoolDirService.insertSelective(record);
    }

    @Override
    public List<School> selectByExample(SchoolExample example) {
        return schoolDirService.selectByExample(example);
    }

    @Override
    public School selectByPrimaryKey(Short schoolid) {
        return schoolDirService.selectByPrimaryKey(schoolid);
    }

    @Override
    public List<School> selectall() {
        SchoolExample schoolExample =  new SchoolExample();
        schoolExample.clear();
        schoolExample.createCriteria();
        return selectByExample(schoolExample);
    }

    @Override
    public int updateByPrimaryKeySelective(School record) {
        return schoolDirService.updateByPrimaryKeySelective(record);
    }
}
