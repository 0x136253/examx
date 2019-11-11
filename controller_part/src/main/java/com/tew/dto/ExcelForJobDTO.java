package com.tew.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.math.BigDecimal;

public class ExcelForJobDTO {

    @Excel(name = "岗位名称")
    private String post;
    @Excel(name = "岗位类别")
    private String clazz;
    @Excel(name = "岗位数量")
    private int num;
    @Excel(name = "包含学校")
    private String schoolin;
    @Excel(name = "笔试入围成绩")
    private BigDecimal writeExam;
    @Excel(name = "面试入围成绩")
    private BigDecimal interExam;

    @Override
    public String toString() {
        return "ExcelForJobDTO{" +
                "post='" + post + '\'' +
                ", clazz='" + clazz + '\'' +
                ", num=" + num +
                ", schoolin='" + schoolin + '\'' +
                ", writeExam=" + writeExam +
                ", interExam=" + interExam +
                '}';
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSchoolin() {
        return schoolin;
    }

    public void setSchoolin(String schoolin) {
        this.schoolin = schoolin;
    }

    public BigDecimal getWriteExam() {
        return writeExam;
    }

    public void setWriteExam(BigDecimal writeExam) {
        this.writeExam = writeExam;
    }

    public BigDecimal getInterExam() {
        return interExam;
    }

    public void setInterExam(BigDecimal interExam) {
        this.interExam = interExam;
    }
}
