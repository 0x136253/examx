package com.tew.service.Impl;

import com.tew.dao.WishMapper;
import com.tew.pojo.Wish;
import com.tew.pojo.WishExample;
import com.tew.service.WishDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wishDAO")
public class WishDAOImpl implements WishDAO {
    @Autowired
    private WishMapper wishMapper;

    @Override
    public int deleteByPrimaryKey(Short wishid) {
        return wishMapper.deleteByPrimaryKey(wishid);
    }

    @Override
    public int insert(Wish record) {
        return wishMapper.insert(record);
    }

    @Override
    public int insertSelective(Wish record) {
        return wishMapper.insertSelective(record);
    }

    @Override
    public List<Wish> selectByExample(WishExample example) {
        return wishMapper.selectByExample(example);
    }

    @Override
    public Wish selectByPrimaryKey(Short wishid) {
        return wishMapper.selectByPrimaryKey(wishid);
    }

    @Override
    public int updateByPrimaryKeySelective(Wish record) {
        return wishMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Wish record) {
        return wishMapper.updateByPrimaryKey(record);
    }
}
