package com.tew.service.Impl;


import com.tew.dao.JobMapper;
import com.tew.pojo.Job;
import com.tew.pojo.JobExample;
import com.tew.service.JobDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobDAO")
public class JobDAOImpl implements JobDAO {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public int deleteByPrimaryKey(Short postid) {
        return jobMapper.deleteByPrimaryKey(postid);
    }

    @Override
    public int insert(Job record) {
        return jobMapper.insert(record);
    }

    @Override
    public int insertSelective(Job record) {
        return jobMapper.insertSelective(record);
    }

    @Override
    public List<Job> selectByExample(JobExample example) {
        return jobMapper.selectByExample(example);
    }

    @Override
    public Job selectByPrimaryKey(Short postid) {
        return jobMapper.selectByPrimaryKey(postid);
    }

    @Override
    public int updateByPrimaryKeySelective(Job record) {
        return jobMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Job record) {
        return jobMapper.updateByPrimaryKey(record);
    }
}
