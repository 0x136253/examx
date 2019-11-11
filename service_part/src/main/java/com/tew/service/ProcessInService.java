package com.tew.service;

import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;

import java.util.List;

public interface ProcessInService {
    int delete(String id);
    int insert(Check record);
    //List<Check> selectByExample(CheckExample example);
    Check select(String icnumber);
    Check selectByID(String id);
    int updateByExample(Check record, CheckExample example);
    int updateByPrimaryKey(Check record);
}
