package com.tew.dto;

import java.util.List;

public class ThemeClazzJobDTO {
    public List<String> getClazzlist() {
        return clazzlist;
    }

    public ThemeClazzJobDTO() {
    }

    public ThemeClazzJobDTO(List<String> clazzlist, List<String> joblist) {
        this.clazzlist = clazzlist;
        this.joblist = joblist;
    }

    public void setClazzlist(List<String> clazzlist) {
        this.clazzlist = clazzlist;
    }

    public List<String> getJoblist() {
        return joblist;
    }

    public void setJoblist(List<String> joblist) {
        this.joblist = joblist;
    }

    private List<String> clazzlist;
    private List<String> joblist;
}
