package com.tew.service;

import com.tew.pojo.Job;
import com.tew.pojo.JobExample;

import java.util.List;

public interface JobDAO {
    int deleteByPrimaryKey(Short postid);
    int insert(Job record);
    int insertSelective(Job record);
    List<Job> selectByExample(JobExample example);
    Job selectByPrimaryKey(Short postid);
    int updateByPrimaryKeySelective(Job record);
    int updateByPrimaryKey(Job record);
}