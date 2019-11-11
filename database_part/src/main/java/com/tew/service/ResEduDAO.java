package com.tew.service;

import com.tew.pojo.ResEdu;
import com.tew.pojo.ResEduExample;

import java.util.List;

public interface ResEduDAO {
    int deleteByPrimaryKey(Short idEdu);
    int insert(ResEdu record);
    int insertSelective(ResEdu record);
    List<ResEdu> selectByExample(ResEduExample example);
    ResEdu selectByPrimaryKey(Short idEdu);
    int updateByPrimaryKeySelective(ResEdu record);
    int updateByPrimaryKey(ResEdu record);
}