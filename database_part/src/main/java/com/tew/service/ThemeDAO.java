package com.tew.service;

import com.tew.pojo.Theme;
import com.tew.pojo.ThemeExample;

import java.util.List;

public interface ThemeDAO {
    int deleteByPrimaryKey(Short themeid);
    int insert(Theme record);
    int insertSelective(Theme record);
    List<Theme> selectByExample(ThemeExample example);
    Theme selectByPrimaryKey(Short themeid);
    int updateByPrimaryKeySelective(Theme record);
    int updateByPrimaryKey(Theme record);
}