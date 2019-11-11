package com.tew.service;

import com.tew.pojo.FileInfo;
import com.tew.pojo.FileInfoExample;

import java.util.List;

public interface FileService {
    int deleteByPrimaryKey(Short id);
    int insert(FileInfo record);
    int insertSelective(FileInfo record);
    List<FileInfo> selectByExample(FileInfoExample example);
    FileInfo selectByPrimaryKey(Short id);
    int updateByPrimaryKeySelective(FileInfo record);
    int updateByPrimaryKey(FileInfo record);
}
