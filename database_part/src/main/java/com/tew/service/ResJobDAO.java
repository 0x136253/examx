package com.tew.service;

import com.tew.pojo.ResJob;
import com.tew.pojo.ResJobExample;

import java.util.List;

public interface ResJobDAO {
    int deleteByPrimaryKey(Short idJob);
    int insert(ResJob record);
    int insertSelective(ResJob record);
    List<ResJob> selectByExample(ResJobExample example);
    ResJob selectByPrimaryKey(Short idJob);
    int updateByPrimaryKeySelective(ResJob record);
    int updateByPrimaryKey(ResJob record);
}