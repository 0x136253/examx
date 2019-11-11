package com.tew.service.Impl;


import com.tew.pojo.*;
import com.tew.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("resService")
public class ResServiceImpl implements ResService {
    @Autowired
    private ResBasDAO resBasDAO;
    @Autowired
    private ResEduDAO resEduDAO;
    @Autowired
    private ResPraDAO resPraDAO;
    @Autowired
    private ResJobDAO resJobDAO;
    @Autowired
    private ResHorDAO resHorDAO;

    @Override
    public int deleteByPrimaryKey_Bas(String id) {
        return resBasDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int insert_Bas(ResBas record) {
        return resBasDAO.insert(record);
    }

    @Override
    public int insertSelective_Bas(ResBas record) {
        return resBasDAO.insertSelective(record);
    }

    @Override
    public List<ResBas> selectByExample_Bas(ResBasExample example) {
        return resBasDAO.selectByExample(example);
    }

    @Override
    public ResBas selectByPrimaryKey_Bas(String id) {
        return resBasDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective_Bas(ResBas record) {
        return resBasDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey_Bas(ResBas record) {
        return resBasDAO.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey_Edu(Short idEdu) {
        return resEduDAO.deleteByPrimaryKey(idEdu);
    }

    @Override
    public int insert_Edu(ResEdu record) {
        return resEduDAO.insert(record);
    }

    @Override
    public int insertSelective_Edu(ResEdu record) {
        return resEduDAO.insertSelective(record);
    }

    @Override
    public List<ResEdu> selectByExample_Edu(ResEduExample example) {
        return resEduDAO.selectByExample(example);
    }

    @Override
    public ResEdu selectByPrimaryKey_Edu(Short idEdu) {
        return resEduDAO.selectByPrimaryKey(idEdu);
    }

    @Override
    public int updateByPrimaryKeySelective_Edu(ResEdu record) {
        return resEduDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey_Edu(ResEdu record) {
        return resEduDAO.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey_Hor(Short idHor) {
        return resHorDAO.deleteByPrimaryKey(idHor);
    }

    @Override
    public int insert_Hor(ResHor record) {
        return resHorDAO.insert(record);
    }

    @Override
    public int insertSelective_Hor(ResHor record) {
        return resHorDAO.insertSelective(record);
    }

    @Override
    public List<ResHor> selectByExample_Hor(ResHorExample example) {
        return resHorDAO.selectByExample(example);
    }

    @Override
    public ResHor selectByPrimaryKey_Hor(Short idHor) {
        return resHorDAO.selectByPrimaryKey(idHor);
    }

    @Override
    public int updateByPrimaryKeySelective_Hor(ResHor record) {
        return resHorDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey_Hor(ResHor record) {
        return resHorDAO.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey_Job(Short idJob) {
        return resJobDAO.deleteByPrimaryKey(idJob);
    }

    @Override
    public int insert_Job(ResJob record) {
        return resJobDAO.insert(record);
    }

    @Override
    public int insertSelective_Job(ResJob record) {
        return resJobDAO.insertSelective(record);
    }

    @Override
    public List<ResJob> selectByExample_Job(ResJobExample example) {
        return resJobDAO.selectByExample(example);
    }

    @Override
    public ResJob selectByPrimaryKey_Job(Short idJob) {
        return resJobDAO.selectByPrimaryKey(idJob);
    }

    @Override
    public int updateByPrimaryKeySelective_Job(ResJob record) {
        return resJobDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey_Job(ResJob record) {
        return resJobDAO.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey_Pra(Short idPra) {
        return resPraDAO.deleteByPrimaryKey(idPra);
    }

    @Override
    public int insert_Pra(ResPra record) {
        return resPraDAO.insert(record);
    }

    @Override
    public int insertSelective_Pra(ResPra record) {
        return resPraDAO.insertSelective(record);
    }

    @Override
    public List<ResPra> selectByExample_Pra(ResPraExample example) {
        return resPraDAO.selectByExample(example);
    }

    @Override
    public ResPra selectByPrimaryKey_Pra(Short idJob) {
        return resPraDAO.selectByPrimaryKey(idJob);
    }

    @Override
    public int updateByPrimaryKeySelective_Pra(ResPra record) {
        return resPraDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey_Pra(ResPra record) {
        return resPraDAO.updateByPrimaryKey(record);
    }
}
