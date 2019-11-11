package com.tew.dto;

import com.tew.pojo.*;

import java.util.List;

public class ResDTO {
    private ResBas resBas;
    private List<ResEdu> resEduList;
    private List<ResHor> resHorList;
    private List<ResJob> resJobList;
    private List<ResPra> resPraList;

    @Override
    public String toString() {
        return "ResDTO{" +
                "resBas=" + resBas +
                ", resEduList=" + resEduList +
                ", resHorList=" + resHorList +
                ", resJobList=" + resJobList +
                ", resPraList=" + resPraList +
                '}';
    }

    public ResBas getResBas() {
        return resBas;
    }

    public void setResBas(ResBas resBas) {
        this.resBas = resBas;
    }

    public List<ResEdu> getResEduList() {
        return resEduList;
    }

    public void setResEduList(List<ResEdu> resEduList) {
        this.resEduList = resEduList;
    }

    public List<ResHor> getResHorList() {
        return resHorList;
    }

    public void setResHorList(List<ResHor> resHorList) {
        this.resHorList = resHorList;
    }

    public List<ResJob> getResJobList() {
        return resJobList;
    }

    public void setResJobList(List<ResJob> resJobList) {
        this.resJobList = resJobList;
    }

    public List<ResPra> getResPraList() {
        return resPraList;
    }

    public void setResPraList(List<ResPra> resPraList) {
        this.resPraList = resPraList;
    }

    public ResDTO() {
    }

    public ResDTO(ResBas resBas, List<ResEdu> resEduList, List<ResHor> resHorList, List<ResJob> resJobList, List<ResPra> resPraList) {
        this.resBas = resBas;
        this.resEduList = resEduList;
        this.resHorList = resHorList;
        this.resJobList = resJobList;
        this.resPraList = resPraList;
    }
}
