package com.tew.service.Impl;

import com.tew.dto.SchoolJobListDTO;
import com.tew.dto.SchoolJobTemp;
import com.tew.pojo.Job;
import com.tew.pojo.SchoolJob;
import com.tew.pojo.Theme;
import com.tew.service.GetPostInService;
import com.tew.service.JobinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class JobinServiceImpl implements JobinService {
    @Autowired
    private GetPostInService getPostInService;

    @Override
    public boolean GetThemeIn(Theme theme) {
        return getPostInService.GetThemeIn(theme);
    }

    @Override
    public boolean GetJobIn(SchoolJobListDTO schoolJobListDTO) {
        List<SchoolJob> schoolJobs = new ArrayList<SchoolJob>();
        List<SchoolJobTemp> schoolJobTemps =schoolJobListDTO.getList();
        for(SchoolJobTemp item:schoolJobTemps){
            schoolJobs.add(item.schoolJob_get());
        }
        return getPostInService.GetJobIn(schoolJobs);
    }

    @Override
    public List<SchoolJob> ShowJobenable(Short themeid) {
        return getPostInService.ShowJobenable(themeid);
    }

    @Override
    public List<SchoolJob> ShowJobdisable(Short themeid) {
        return getPostInService.ShowJobdisable(themeid);
    }

    @Override
    public List<SchoolJob> ShowJobnotPass(Short themeid) {
        return getPostInService.ShowJobnotPass(themeid);
    }

    @Override
    public List<SchoolJob> ShowJobenableSchool(Short themeid, Short schoolid) {
        return getPostInService.ShowJobenableSchool(themeid,schoolid);
    }

    @Override
    public List<SchoolJob> ShowJobdisableSchool(Short themeid, Short schoolid) {
        return getPostInService.ShowJobdisableSchool(themeid,schoolid);
    }

    @Override
    public List<SchoolJob> ShowJobnotPassSchool(Short themeid, Short schoolid) {
        return getPostInService.ShowJobnotPassSchool(themeid,schoolid);
    }

    @Override
    public boolean SetJobenable(List<Integer> passid,List<Integer> notpassid) {
//        List<Short> pass = new ArrayList<Short>();
//        for (int item:passid){
//            pass.add((short)item);
//        }
//        List<Short> notpass = new ArrayList<Short>();
//        for (int item:notpassid){
//            notpass.add((short)item);
//        }
        return getPostInService.SetJobenable(passid,notpassid);
    }
}
