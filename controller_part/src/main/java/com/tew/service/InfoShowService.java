package com.tew.service;

import com.tew.dto.SchoolWishDTO;
import com.tew.dto.ThemeClazzJobDTO;
import com.tew.pojo.Job;
import com.tew.pojo.Person;
import com.tew.pojo.SchoolJob;
import com.tew.pojo.Theme;

import java.util.List;

public interface InfoShowService {
    public List<Person> showByID(String IcNumber);
    public List<Theme>  showTheme();
    public List<SchoolJob> showSchoolJob(Short themeid,Short schoolid);
    public List<Job> showJob(Short themeid);
    public List<SchoolJob> showJobList(String clazz, String post);
    public ThemeClazzJobDTO showJobClazz(Short themeid);
    public List<SchoolWishDTO> showWishNet(Short themeid);
    public List<SchoolWishDTO> showWishNet(Short themeid,Short schoolid);
}
