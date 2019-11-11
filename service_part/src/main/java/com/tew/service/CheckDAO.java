package com.tew.service;

import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;

import java.util.List;

public interface CheckDAO {
    int deleteByPrimaryKey(String id);
    int insert(Check record);
    int insertSelective(Check record);
    List<Check> selectByExample(CheckExample example);
    Check selectByPrimaryKey(String id);
    int updateByExampleSelective(Check record, CheckExample example);
    int updateByExample(Check record, CheckExample example);
    int updateByPrimaryKeySelective(Check record);
    int updateByPrimaryKey(Check record);

}