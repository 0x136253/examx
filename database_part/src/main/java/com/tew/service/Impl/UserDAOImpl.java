package com.tew.service.Impl;

import com.tew.dao.UserMapper;
import com.tew.pojo.User;
import com.tew.service.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userDAO")
public class UserDAOImpl implements UserDAO {
    @Resource
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectByIcNumber(String IcNumber) {
        return userMapper.selectByIcNumber(IcNumber);
    }

    @Override
    public User selectByTel(String Tel) {
        return userMapper.selectByTel(Tel);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User getIdByIcNumber(String IcNumber) {
        return userMapper.getIdByIcNumber(IcNumber);
    }
}