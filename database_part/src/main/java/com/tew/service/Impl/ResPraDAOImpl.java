package com.tew.service.Impl;

import com.tew.dao.ResJobMapper;
import com.tew.dao.ResPraMapper;
import com.tew.pojo.ResJob;
import com.tew.pojo.ResJobExample;
import com.tew.pojo.ResPra;
import com.tew.pojo.ResPraExample;
import com.tew.service.ResPraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("resPraDAO")
public class ResPraDAOImpl implements ResPraDAO{
    @Autowired
    private ResPraMapper resPraMapper;

    @Override
    public int deleteByPrimaryKey(Short idPra) {
        return resPraMapper.deleteByPrimaryKey(idPra);
    }

    @Override
    public int insert(ResPra record) {
        return resPraMapper.insert(record);
    }

    @Override
    public int insertSelective(ResPra record) {
        return resPraMapper.insertSelective(record);
    }

    @Override
    public List<ResPra> selectByExample(ResPraExample example) {
        return resPraMapper.selectByExample(example);
    }

    @Override
    public ResPra selectByPrimaryKey(Short idPra) {
        return resPraMapper.selectByPrimaryKey(idPra);
    }

    @Override
    public int updateByPrimaryKeySelective(ResPra record) {
        return resPraMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ResPra record) {
        return resPraMapper.updateByPrimaryKey(record);
    }
}
