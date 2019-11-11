package com.tew.service.Impl;

import com.tew.dao.FileInfoMapper;
import com.tew.pojo.FileInfo;
import com.tew.pojo.FileInfoExample;
import com.tew.service.FileInfoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("fileInfoDAO")
public class FileInfoDAOImpl implements FileInfoDAO {
    @Autowired
    private FileInfoMapper fileInfoMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return fileInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FileInfo record) {
        return fileInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(FileInfo record) {
        return fileInfoMapper.insertSelective(record);
    }

    @Override
    public List<FileInfo> selectByExample(FileInfoExample example) {
        return fileInfoMapper.selectByExample(example);
    }

    @Override
    public FileInfo selectByPrimaryKey(Short id) {
        return fileInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FileInfo record) {
        return fileInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FileInfo record) {
        return fileInfoMapper.updateByPrimaryKey(record);
    }
}
