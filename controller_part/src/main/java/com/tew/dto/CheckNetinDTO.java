package com.tew.dto;

import java.util.List;

public class CheckNetinDTO {
    private short themeid;
    private List<String> passid;
    private List<String> notpassid;

    public CheckNetinDTO(short themeid, List<String> passid, List<String> notpassid) {
        this.themeid = themeid;
        this.passid = passid;
        this.notpassid = notpassid;
    }

    public CheckNetinDTO() {
    }

    @Override
    public String toString() {
        return "CheckNetinDTO{" +
                "themeid=" + themeid +
                ", passid=" + passid +
                ", notpassid=" + notpassid +
                '}';
    }

    public short getThemeid() {
        return themeid;
    }

    public void setThemeid(short themeid) {
        this.themeid = themeid;
    }

    public List<String> getPassid() {
        return passid;
    }

    public void setPassid(List<String> passid) {
        this.passid = passid;
    }

    public List<String> getNotpassid() {
        return notpassid;
    }

    public void setNotpassid(List<String> notpassid) {
        this.notpassid = notpassid;
    }
}
