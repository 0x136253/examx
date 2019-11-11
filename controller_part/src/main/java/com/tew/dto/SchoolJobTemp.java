package com.tew.dto;

import com.tew.pojo.SchoolJob;

import java.util.Date;

public class SchoolJobTemp {
//    private Short schoolTheJobid;
    private Short themeid;
    private String post;
    private Short num;
//    private Date createAt;
    private String request;
//    private Short schoolid;
    private String schoolName;
 //   private String clazz;
//    private Short enable;


    public SchoolJob schoolJob_get(){
        SchoolJob schoolJob =new SchoolJob();
        schoolJob.setThemeid(themeid);
        schoolJob.setNum(num);
        schoolJob.setPost(post);
        schoolJob.setRequest(request);
        schoolJob.setSchoolName(schoolName);
      //  schoolJob.setClazz(clazz);
        return schoolJob;
    }

    @Override
    public String toString() {
        return "SchoolJobTemp{" +
                "themeid=" + themeid +
                ", post='" + post + '\'' +
                ", num=" + num +
                ", request='" + request + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public Short getThemeid() {
        return themeid;
    }

    public void setThemeid(Short themeid) {
        this.themeid = themeid;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public SchoolJobTemp() {
    }

    public SchoolJobTemp(Short themeid, String post, Short num, String request, String schoolName) {
        this.themeid = themeid;
        this.post = post;
        this.num = num;
        this.request = request;
        this.schoolName = schoolName;
    }
}
