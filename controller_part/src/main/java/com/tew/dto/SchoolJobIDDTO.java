package com.tew.dto;

import java.util.List;

public class SchoolJobIDDTO {
    private List<Integer> passllist;
    private List<Integer> notpasslist;

    public List<Integer> getPassllist() {
        return passllist;
    }

    public void setPassllist(List<Integer> passllist) {
        this.passllist = passllist;
    }

    public List<Integer> getNotpasslist() {
        return notpasslist;
    }

    public void setNotpasslist(List<Integer> notpasslist) {
        this.notpasslist = notpasslist;
    }

    public SchoolJobIDDTO() {
    }

    public SchoolJobIDDTO(List<Integer> passllist, List<Integer> notpasslist) {
        this.passllist = passllist;
        this.notpasslist = notpasslist;
    }
}
