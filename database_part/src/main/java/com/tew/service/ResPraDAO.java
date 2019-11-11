package com.tew.service;

import com.tew.pojo.ResPra;
import com.tew.pojo.ResPraExample;

import java.util.List;

public interface ResPraDAO {
    int deleteByPrimaryKey(Short idJob);
    int insert(ResPra record);
    int insertSelective(ResPra record);
    List<ResPra> selectByExample(ResPraExample example);
    ResPra selectByPrimaryKey(Short idJob);
    int updateByPrimaryKeySelective(ResPra record);
    int updateByPrimaryKey(ResPra record);
}