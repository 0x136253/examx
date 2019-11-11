package com.tew.service.Impl;

import com.tew.dao.ThemeMapper;
import com.tew.pojo.Theme;
import com.tew.pojo.ThemeExample;
import com.tew.service.ThemeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("themeDAO")
public class ThemeDAOImpl implements ThemeDAO {
    @Autowired
    private ThemeMapper themeMapper;

    @Override
    public int deleteByPrimaryKey(Short themeid) {
        return themeMapper.deleteByPrimaryKey(themeid);
    }

    @Override
    public int insert(Theme record) {
        return themeMapper.insert(record);
    }

    @Override
    public int insertSelective(Theme record) {
        return themeMapper.insertSelective(record);
    }

    @Override
    public List<Theme> selectByExample(ThemeExample example) {
        return themeMapper.selectByExample(example);
    }

    @Override
    public Theme selectByPrimaryKey(Short themeid) {
        return themeMapper.selectByPrimaryKey(themeid);
    }

    @Override
    public int updateByPrimaryKeySelective(Theme record) {
        return themeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Theme record) {
        return themeMapper.updateByPrimaryKey(record);
    }
}
