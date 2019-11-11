package com.tew.service;

import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;

import java.util.List;

public interface SchoolService {
    int deleteByPrimaryKey(Short schoolid);
    int insertSelective(School record);
    List<School> selectByExample(SchoolExample example);
    School selectByPrimaryKey(Short schoolid);
    List<School> selectall();
    int updateByPrimaryKeySelective(School record);
}
