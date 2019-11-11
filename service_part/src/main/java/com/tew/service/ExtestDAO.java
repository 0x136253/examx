package com.tew.service;

import com.tew.pojo.Extest;
import com.tew.pojo.ExtestExample;

import java.util.List;

public interface ExtestDAO {
    int deleteByPrimaryKey(String id);
    int insert(Extest record);
    int insertSelective(Extest record);
    List<Extest> selectByExample(ExtestExample example);
    Extest selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(Extest record);
    int updateByPrimaryKey(Extest record);
}