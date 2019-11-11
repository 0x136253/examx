package com.tew.service.Impl;


import com.tew.pojo.*;
import com.tew.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("wishinService")
public class WishinServiceImpl implements WishinService {
    @Autowired
    private WishDAO wishDAO;

    @Autowired
    private PersonDAO personDAO;
    @Autowired
    private SchoolDAO schoolDAO;
    @Autowired
    private JobDAO jobDAO;
    @Autowired
    private ProcessInService processInService;
    @Override
    public int deleteByPrimaryKey(Short wishid) {
        return wishDAO.deleteByPrimaryKey(wishid);
    }

    @Override
    public int insert(Wish record) {
        return wishDAO.insert(record);
    }

    @Override
    public int insertSelective(Wish record) { ;
        School school = new School();
        SchoolExample schoolExample=new SchoolExample();
        schoolExample.createCriteria().andSchoolNameEqualTo(record.getSchoolName());
        school=schoolDAO.selectByExample(schoolExample).get(0);
        record.setSchoolid(school.getSchoolid());
        JobExample jobExample = new JobExample();
        jobExample.createCriteria().andClazzEqualTo(school.getClazz()).andPostEqualTo(record.getPost()).andThemeidEqualTo(record.getThemeid());
        Job job = jobDAO.selectByExample(jobExample).get(0);
        record.setPostid(job.getPostid());
        Check check = processInService.selectByID(record.getId());
        check.setTrialWish((short)1);
        check.setThemeid(record.getThemeid());
        processInService.updateByPrimaryKey(check);
        return wishDAO.insertSelective(record);
    }

    @Override
    public List<Wish> selectByExample(WishExample example) {
        return wishDAO.selectByExample(example);
    }

    @Override
    public Wish selectByPrimaryKey(Short wishid) {
        return wishDAO.selectByPrimaryKey(wishid);
    }

    @Override
    public int updateByPrimaryKeySelective(Wish record) {
//        PersonExample personExample = new PersonExample();
//        personExample.createCriteria().andIcNumberEqualTo(record.getId());
//        String id= personDAO.selectByExample(personExample).get(0).getId();
        WishExample wishExample = new WishExample();
        wishExample.createCriteria().andThemeidEqualTo(record.getThemeid()).andIdEqualTo(record.getId());
        record.setWishid(wishDAO.selectByExample(wishExample).get(0).getWishid());
        School school = new School();
        SchoolExample schoolExample=new SchoolExample();
        schoolExample.createCriteria().andSchoolNameEqualTo(record.getSchoolName());
        school=schoolDAO.selectByExample(schoolExample).get(0);
        record.setSchoolid(school.getSchoolid());
        JobExample jobExample = new JobExample();
        jobExample.createCriteria().andClazzEqualTo(school.getClazz()).andPostEqualTo(record.getPost()).andThemeidEqualTo(record.getThemeid());
        Job job = jobDAO.selectByExample(jobExample).get(0);
        record.setPostid(job.getPostid());
        record.setCreateAt(new Date());
        return wishDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Wish record) {
        return wishDAO.updateByPrimaryKey(record);
    }
}
