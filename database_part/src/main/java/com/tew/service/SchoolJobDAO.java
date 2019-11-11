package com.tew.service;

import com.tew.pojo.SchoolJob;
import com.tew.pojo.SchoolJobExample;

import java.util.List;

public interface SchoolJobDAO {
    int deleteByPrimaryKey(Short schoolTheJobid);
    int insert(SchoolJob record);
    int insertSelective(SchoolJob record);
    List<SchoolJob> selectByExample(SchoolJobExample example);
    SchoolJob selectByPrimaryKey(Short schoolTheJobid);
    int updateByPrimaryKeySelective(SchoolJob record);
    int updateByPrimaryKey(SchoolJob record);
}