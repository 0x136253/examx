package com.tew.service;

import com.tew.pojo.Job;
import com.tew.pojo.SchoolJob;
import com.tew.pojo.Theme;

import java.util.List;

public interface GetPostInService {
    public List<Theme> ShowAllTheme();
    public List<Job> ShowJobByThemeID(Short themeid);
    public List<SchoolJob> ShowSchoolByID(Short themeid, Short schoolid);
    public boolean GetThemeIn(Theme theme);
    public boolean GetJobIn(List<SchoolJob> SchoolJob);
    public List<SchoolJob> ShowJobenable(Short themeid);
    public List<SchoolJob> ShowJobdisable(Short themeid);
    public List<SchoolJob> ShowJobnotPass(Short themeid);
    public List<SchoolJob> ShowJobenableSchool(Short themeid, Short schoolid);
    public List<SchoolJob> ShowJobdisableSchool(Short themeid, Short schoolid);
    public List<SchoolJob> ShowJobnotPassSchool(Short themeid, Short schoolid);
    public boolean SetJobenable(List<Integer> passid, List<Integer> notpassid);
    public List<SchoolJob> showJobList(String clazz, String post);
    public Theme showThemeByID(short id);
}
