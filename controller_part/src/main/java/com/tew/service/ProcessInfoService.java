package com.tew.service;

import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;

public interface ProcessInfoService {
    Check select(String icnumber);
    int updateByExample(Check record, CheckExample example);
    int updateByPrimaryKey(Check record);
}
