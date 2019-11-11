package com.tew.service;

import com.tew.dto.SchoolJobListDTO;
import com.tew.dto.SchoolJobTemp;
import com.tew.pojo.Job;
import com.tew.pojo.SchoolJob;
import com.tew.pojo.Theme;

import java.util.List;

public interface JobinService {
    public boolean GetThemeIn(Theme theme);
    public boolean GetJobIn(SchoolJobListDTO schoolJobListDTO);
    public List<SchoolJob> ShowJobenable(Short themeid);
    public List<SchoolJob> ShowJobdisable(Short themeid);
    public List<SchoolJob> ShowJobnotPass(Short themeid);
    public List<SchoolJob> ShowJobenableSchool(Short themeid, Short schoolid);
    public List<SchoolJob> ShowJobdisableSchool(Short themeid, Short schoolid);
    public List<SchoolJob> ShowJobnotPassSchool(Short themeid, Short schoolid);
    public boolean SetJobenable(List<Integer> passid, List<Integer> notpassid);

}
