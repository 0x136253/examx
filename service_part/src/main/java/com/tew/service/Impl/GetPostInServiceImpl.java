package com.tew.service.Impl;

import com.tew.pojo.*;
import com.tew.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("getPostInService")
public class GetPostInServiceImpl implements GetPostInService {
    @Autowired
    private ThemeDAO themeDAO;
    @Autowired
    private SchoolJobDAO schoolJobDAO;
    @Autowired
    private JobDAO jobDAO;

    @Autowired
    private SchoolDAO schoolDAO;
    @Override
    public List<Theme> ShowAllTheme() {
        ThemeExample themeExample = new ThemeExample();
        themeExample.createCriteria();
        return themeDAO.selectByExample(themeExample);
    }

    @Override
    public List<Job> ShowJobByThemeID(Short themeid) {
        JobExample jobExample = new JobExample();
        jobExample.createCriteria().andThemeidEqualTo(themeid);
        return jobDAO.selectByExample(jobExample);
    }

    @Override
    public List<SchoolJob> ShowSchoolByID(Short themeid,Short schoolid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andSchoolidEqualTo(schoolid).andThemeidEqualTo(themeid);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public boolean GetThemeIn(Theme theme) {
        String schoolin = theme.getSchoolin();
        String[] schoolname = schoolin.split(",");
        SchoolExample schoolExample=new SchoolExample();
        schoolExample.createCriteria();
        String schoolid = new String();
        for(int i=0;i<schoolname.length;i++){
            String item = schoolname[i];
            System.out.println(item);
            schoolExample.clear();
         //   schoolExample.c
            schoolExample.createCriteria().andSchoolNameEqualTo(item);
            schoolid=schoolid+schoolDAO.selectByExample(schoolExample).get(0).getSchoolid();
            if(i+1!=schoolname.length){
                schoolid+=",";
            }
        }
        System.out.println(schoolid);
        theme.setSchoolinid(schoolid);
        themeDAO.insertSelective(theme);
        return true;
    }

    @Override
    public boolean GetJobIn(List<SchoolJob> schoolJob) {
        SchoolExample schoolExample=new SchoolExample();
        for (SchoolJob item:schoolJob){
            schoolExample.clear();
            schoolExample.createCriteria().andSchoolNameEqualTo(item.getSchoolName());
            School school=schoolDAO.selectByExample(schoolExample).get(0);
            item.setSchoolid(school.getSchoolid());
            item.setClazz(school.getClazz());
            schoolJobDAO.insertSelective(item);
        }
        return true;
    }

    @Override
    public List<SchoolJob> ShowJobenable(Short themeid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andThemeidEqualTo(themeid).andEnableEqualTo((short)1);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public List<SchoolJob> ShowJobdisable(Short themeid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andThemeidEqualTo(themeid).andEnableEqualTo((short)0);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public List<SchoolJob> ShowJobnotPass(Short themeid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andThemeidEqualTo(themeid).andEnableEqualTo((short)2);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public List<SchoolJob> ShowJobenableSchool(Short themeid, Short schoolid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andThemeidEqualTo(themeid).andEnableEqualTo((short)1).andSchoolidEqualTo(schoolid);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public List<SchoolJob> ShowJobdisableSchool(Short themeid, Short schoolid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andThemeidEqualTo(themeid).andEnableEqualTo((short)0).andSchoolidEqualTo(schoolid);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public List<SchoolJob> ShowJobnotPassSchool(Short themeid, Short schoolid) {
        SchoolJobExample schoolJobExample= new SchoolJobExample();
        schoolJobExample.createCriteria().andThemeidEqualTo(themeid).andEnableEqualTo((short)2).andSchoolidEqualTo(schoolid);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public boolean SetJobenable(List<Integer> passid,List<Integer> notpassid) {
        for(int i=0;i<notpassid.size();i++){
            int tem =notpassid.get(i);
            SchoolJob schoolJob = schoolJobDAO.selectByPrimaryKey((short)tem);
            schoolJob.setEnable((short)2);
            schoolJobDAO.updateByPrimaryKeySelective(schoolJob);
        }
        for(int i=0;i<passid.size();i++){
            System.out.println("<><><><>");
            System.out.println(passid.get(i).getClass());
            int tem =passid.get(i);
            SchoolJob schoolJob = schoolJobDAO.selectByPrimaryKey((short)tem);
            schoolJob.setEnable((short)1);
            JobExample jobExample = new JobExample();
            jobExample.clear();
            System.out.println(schoolJob);
            jobExample.createCriteria()
                    .andThemeidEqualTo(schoolJob.getThemeid())
                    .andPostEqualTo(schoolJob.getPost())
                    .andClazzEqualTo(schoolJob.getClazz());
            List<Job> list = jobDAO.selectByExample(jobExample);
            Job job = null;
            if(list.size()==0){
                job = new Job();
                job.setThemeid(schoolJob.getThemeid());
                job.setPost(schoolJob.getPost());
                job.setDescription("temp null");
                job.setClazz(schoolJob.getClazz());
                job.setNum(schoolJob.getNum());
                job.setSchoolin(schoolJob.getSchoolName());
                job.setSchoolinid(schoolJob.getSchoolid().toString());
                jobDAO.insertSelective(job);
            }
            else{
                job = list.get(0);
                job.setNum((short)(job.getNum()+schoolJob.getNum()));
                job.setSchoolin(job.getSchoolin()+","+schoolJob.getSchoolName());
                job.setSchoolinid(job.getSchoolinid()+","+schoolJob.getSchoolid().toString());
                jobDAO.updateByPrimaryKeySelective(job);
            }
            schoolJobDAO.updateByPrimaryKeySelective(schoolJob);
        }
        return true;
    }

    @Override
    public List<SchoolJob> showJobList(String clazz, String post) {
        SchoolJobExample schoolJobExample = new SchoolJobExample();
        schoolJobExample.createCriteria().andClazzEqualTo(clazz).andPostEqualTo(post);
        return schoolJobDAO.selectByExample(schoolJobExample);
    }

    @Override
    public Theme showThemeByID(short id) {
        return themeDAO.selectByPrimaryKey(id);
    }
}
