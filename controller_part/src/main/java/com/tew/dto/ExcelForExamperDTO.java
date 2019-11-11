package com.tew.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.io.Serializable;

@ExcelTarget("examper")
public class ExcelForExamperDTO implements Serializable {
    private short themeid;

    @Excel(name = "座位数")
    private int num;

    @Excel(name = "考场号")
    private int xname;

    @Excel(name = "考场地址")
    private String address;
    @Excel(name = "考试类别")
    private String clazz;

    @Override
    public String toString() {
        return "ExcelForExamperDTO{" +
                "themeid='" + themeid + '\'' +
                ", num=" + num +
                ", xname=" + xname +
                ", address='" + address + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    public short getThemeid() {
        return themeid;
    }

    public void setThemeid(short themeid) {
        this.themeid = themeid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getXname() {
        return xname;
    }

    public void setXname(int xname) {
        this.xname = xname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
