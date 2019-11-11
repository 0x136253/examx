package com.tew.service;

import com.tew.pojo.Health;
import com.tew.pojo.HealthExample;

import java.util.List;

public interface HealthDAO {
    int deleteByPrimaryKey(String id);
    int insert(Health record);
    int insertSelective(Health record);
    List<Health> selectByExample(HealthExample example);
    Health selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(Health record);
    int updateByPrimaryKey(Health record);
}