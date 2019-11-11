package com.tew.dto;

public class Student {
    private String NAME;
    private String SEX;

    public Student() {
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

    public Student(String NAME, String SEX) {
        this.NAME = NAME;
        this.SEX = SEX;
    }
}
