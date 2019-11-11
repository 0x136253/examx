package com.tew.dto;

import java.util.Date;

public class ExamPermissDTO {
    private String NAME;
    private String SEX;
    private String IC_NUMBER;

    private String CLAZZ;
    private String TIME;
    private String ADDRESS;
    private String ATTENDNUM;

    @Override
    public String toString() {
        return "ExamPermissDTO{" +
                "NAME='" + NAME + '\'' +
                ", SEX='" + SEX + '\'' +
                ", IC_NUMBER='" + IC_NUMBER + '\'' +
                ", CLAZZ='" + CLAZZ + '\'' +
                ", TIME='" + TIME + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", ATTENDNUM='" + ATTENDNUM + '\'' +
                '}';
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getIC_NUMBER() {
        return IC_NUMBER;
    }

    public void setIC_NUMBER(String IC_NUMBER) {
        this.IC_NUMBER = IC_NUMBER;
    }

    public String getCLAZZ() {
        return CLAZZ;
    }

    public void setCLAZZ(String CLAZZ) {
        this.CLAZZ = CLAZZ;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getATTENDNUM() {
        return ATTENDNUM;
    }

    public void setATTENDNUM(String ATTENDNUM) {
        this.ATTENDNUM = ATTENDNUM;
    }

    public ExamPermissDTO() {
    }

    public ExamPermissDTO(String NAME, String SEX, String IC_NUMBER, String CLAZZ, String TIME, String ADDRESS, String ATTENDNUM) {
        this.NAME = NAME;
        this.SEX = SEX;
        this.IC_NUMBER = IC_NUMBER;
        this.CLAZZ = CLAZZ;
        this.TIME = TIME;
        this.ADDRESS = ADDRESS;
        this.ATTENDNUM = ATTENDNUM;
    }
}
