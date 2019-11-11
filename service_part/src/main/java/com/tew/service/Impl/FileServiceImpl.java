package com.tew.service.Impl;

import com.tew.pojo.FileInfo;
import com.tew.pojo.FileInfoExample;
import com.tew.service.FileInfoDAO;
import com.tew.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fileService")
public class FileServiceImpl implements FileService {

    @Autowired
    private FileInfoDAO fileInfoDAO;
    @Override
    public int deleteByPrimaryKey(Short id) {
        return fileInfoDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FileInfo record) {
        return fileInfoDAO.insert(record);
    }

    @Override
    public int insertSelective(FileInfo record) {
        return fileInfoDAO.insertSelective(record);
    }

    @Override
    public List<FileInfo> selectByExample(FileInfoExample example) {
        return fileInfoDAO.selectByExample(example);
    }

    @Override
    public FileInfo selectByPrimaryKey(Short id) {
        return fileInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FileInfo record) {
        return fileInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FileInfo record) {
        return fileInfoDAO.updateByPrimaryKey(record);
    }
}
