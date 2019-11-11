package com.tew.service;

import com.tew.pojo.Wish;
import com.tew.pojo.WishExample;

import java.util.List;

public interface WishinService {
    int deleteByPrimaryKey(Short wishid);
    int insert(Wish record);
    int insertSelective(Wish record);
    List<Wish> selectByExample(WishExample example);
    Wish selectByPrimaryKey(Short wishid);
    int updateByPrimaryKeySelective(Wish record);
    int updateByPrimaryKey(Wish record);
}
