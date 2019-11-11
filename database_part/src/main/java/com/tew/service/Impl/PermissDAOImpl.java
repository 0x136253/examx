package com.tew.service.Impl;

import com.tew.dao.PermissMapper;
import com.tew.pojo.Permiss;
import com.tew.pojo.PermissExample;
import com.tew.service.PermissDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("permissDAO")
public class PermissDAOImpl implements PermissDAO {

    @Resource
    private PermissMapper permissMapper;
    @Override
    public int deleteByPrimaryKey(Short powerid) {
        return permissMapper.deleteByPrimaryKey(powerid);
    }

    @Override
    public int insert(Permiss record) {
        return permissMapper.insert(record);
    }

    @Override
    public int insertSelective(Permiss record) {
        return permissMapper.insertSelective(record);
    }

    @Override
    public List<Permiss> selectByExample(PermissExample example) {
        return permissMapper.selectByExample(example);
    }

    @Override
    public Permiss selectByPrimaryKey(Short powerid) {
        return permissMapper.selectByPrimaryKey(powerid);
    }

    @Override
    public int updateByPrimaryKeySelective(Permiss record) {
        return permissMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Permiss record) {
        return permissMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Permiss>  selectById(String id) {
        return permissMapper.selectById(id);
    }
}