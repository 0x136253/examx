package com.tew.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.io.Serializable;

@ExcelTarget("examper")
public class ExcelForbaodaoDTO implements Serializable {
    private short themeid;

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "身份证号码")
    private String ID;

    @Excel(name = "学校")
    private String school;
    @Excel(name = "岗位")
    private String post;
    @Excel(name = "是否报道(是/否)")
    private String gone;

    @Override
    public String toString() {
        return "ExcelForbaodaoDTO{" +
                "themeid=" + themeid +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", school='" + school + '\'' +
                ", post='" + post + '\'' +
                ", gone='" + gone + '\'' +
                '}';
    }

    public short getThemeid() {
        return themeid;
    }

    public void setThemeid(short themeid) {
        this.themeid = themeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getGone() {
        return gone;
    }

    public void setGone(String gone) {
        this.gone = gone;
    }
}
