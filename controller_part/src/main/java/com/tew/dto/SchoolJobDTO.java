package com.tew.dto;

public class SchoolJobDTO {
    private Short themeid;
    private Short schoolid;

    @Override
    public String toString() {
        return "SchoolJobDTO{" +
                "themeid=" + themeid +
                ", schoolid=" + schoolid +
                '}';
    }

    public Short getThemeid() {
        return themeid;
    }

    public void setThemeid(Short themeid) {
        this.themeid = themeid;
    }

    public Short getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Short schoolid) {
        this.schoolid = schoolid;
    }

    public SchoolJobDTO() {
    }

    public SchoolJobDTO(Short themeid, Short schoolid) {
        this.themeid = themeid;
        this.schoolid = schoolid;
    }
}
