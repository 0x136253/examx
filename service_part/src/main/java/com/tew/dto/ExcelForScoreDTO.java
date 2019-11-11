package com.tew.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.math.BigDecimal;

@ExcelTarget("scorein")
public class ExcelForScoreDTO {
    @Override
    public String toString() {
        return "ExcelForScoreDTO{" +
                "id='" + id + '\'' +
                ", themeid=" + themeid +
                ", score=" + score +
                '}';
    }

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "性别")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Excel(name = "身份证号码")
    private String id;

    private short themeid;
    @Excel(name = "成绩")
    private BigDecimal score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public short getThemeid() {
        return themeid;
    }

    public void setThemeid(short themeid) {
        this.themeid = themeid;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
