package com.tew.service;

import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;

import java.util.List;

public interface SchoolDAO {
    int deleteByPrimaryKey(Short schoolid);
    int insert(School record);
    int insertSelective(School record);
    List<School> selectByExample(SchoolExample example);
    School selectByPrimaryKey(Short schoolid);
    int updateByPrimaryKeySelective(School record);
    int updateByPrimaryKey(School record);
}