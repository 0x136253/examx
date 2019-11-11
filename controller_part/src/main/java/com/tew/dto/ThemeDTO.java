package com.tew.dto;

import com.tew.pojo.Theme;

import java.util.Date;

public class ThemeDTO {
//    private Short themeid;
    private String theme;
//    private Date createAt;
    private String userfulTime;
//    private Short enable;
    private String description;
    private String schoolin;
//    private String schoolinid;
    private String request;
    private Date endTime;

    public Theme Theme_get(){
        Theme themee = new Theme();
        themee.setTheme(theme);
        themee.setUserfulTime(userfulTime);
        themee.setDescription(description);
        themee.setSchoolin(schoolin);
        themee.setRequest(request);
        themee.setEndTime(endTime);
        return  themee;
    }

    @Override
    public String toString() {
        return "ThemeDTO{" +
                "theme='" + theme + '\'' +
                ", userfulTime='" + userfulTime + '\'' +
                ", description='" + description + '\'' +
                ", schoolin='" + schoolin + '\'' +
                ", request='" + request + '\'' +
                ", endTime=" + endTime +
                '}';
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getUserfulTime() {
        return userfulTime;
    }

    public void setUserfulTime(String userfulTime) {
        this.userfulTime = userfulTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchoolin() {
        return schoolin;
    }

    public void setSchoolin(String schoolin) {
        this.schoolin = schoolin;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ThemeDTO() {
    }

    public ThemeDTO(String theme, String userfulTime, String description, String schoolin, String request, Date endTime) {
        this.theme = theme;
        this.userfulTime = userfulTime;
        this.description = description;
        this.schoolin = schoolin;
        this.request = request;
        this.endTime = endTime;
    }
}
