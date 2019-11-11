package com.tew.service.Impl;

import com.tew.dao.PersonMapper;
import com.tew.pojo.Person;
import com.tew.pojo.PersonExample;
import com.tew.service.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personDAO")
public class PersonDAOImpl implements PersonDAO {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Person record) {
        return personMapper.insert(record);
    }

    @Override
    public int insertSelective(Person record) {
        return personMapper.insertSelective(record);
    }

    @Override
    public Person selectByPrimaryKey(String id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> selectByExample(PersonExample example) {
        return personMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record) {
        return personMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return personMapper.updateByPrimaryKey(record);
    }
}