package com.tew.service;

import com.tew.pojo.ResBas;
import com.tew.pojo.ResBasExample;

import java.util.List;

public interface ResBasDAO {
    int deleteByPrimaryKey(String id);
    int insert(ResBas record);
    int insertSelective(ResBas record);
    List<ResBas> selectByExample(ResBasExample example);
    ResBas selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(ResBas record);
    int updateByPrimaryKey(ResBas record);
}