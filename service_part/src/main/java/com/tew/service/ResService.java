package com.tew.service;

import com.tew.pojo.*;

import java.util.List;

public interface ResService {
    int deleteByPrimaryKey_Bas(String id);
    int insert_Bas(ResBas record);
    int insertSelective_Bas(ResBas record);
    List<ResBas> selectByExample_Bas(ResBasExample example);
    ResBas selectByPrimaryKey_Bas(String id);
    int updateByPrimaryKeySelective_Bas(ResBas record);
    int updateByPrimaryKey_Bas(ResBas record);


    int deleteByPrimaryKey_Edu(Short idEdu);
    int insert_Edu(ResEdu record);
    int insertSelective_Edu(ResEdu record);
    List<ResEdu> selectByExample_Edu(ResEduExample example);
    ResEdu selectByPrimaryKey_Edu(Short idEdu);
    int updateByPrimaryKeySelective_Edu(ResEdu record);
    int updateByPrimaryKey_Edu(ResEdu record);

    int deleteByPrimaryKey_Hor(Short idHor);
    int insert_Hor(ResHor record);
    int insertSelective_Hor(ResHor record);
    List<ResHor> selectByExample_Hor(ResHorExample example);
    ResHor selectByPrimaryKey_Hor(Short idHor);
    int updateByPrimaryKeySelective_Hor(ResHor record);
    int updateByPrimaryKey_Hor(ResHor record);

    int deleteByPrimaryKey_Job(Short idJob);
    int insert_Job(ResJob record);
    int insertSelective_Job(ResJob record);
    List<ResJob> selectByExample_Job(ResJobExample example);
    ResJob selectByPrimaryKey_Job(Short idJob);
    int updateByPrimaryKeySelective_Job(ResJob record);
    int updateByPrimaryKey_Job(ResJob record);

    int deleteByPrimaryKey_Pra(Short idPra);
    int insert_Pra(ResPra record);
    int insertSelective_Pra(ResPra record);
    List<ResPra> selectByExample_Pra(ResPraExample example);
    ResPra selectByPrimaryKey_Pra(Short idPra);
    int updateByPrimaryKeySelective_Pra(ResPra record);
    int updateByPrimaryKey_Pra(ResPra record);
}
