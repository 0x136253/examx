package com.tew.service;

import com.tew.pojo.ResHor;
import com.tew.pojo.ResHorExample;

import java.util.List;

public interface ResHorDAO {
    int deleteByPrimaryKey(Short idHor);
    int insert(ResHor record);
    int insertSelective(ResHor record);
    List<ResHor> selectByExample(ResHorExample example);
    ResHor selectByPrimaryKey(Short idHor);
    int updateByPrimaryKeySelective(ResHor record);
    int updateByPrimaryKey(ResHor record);
}