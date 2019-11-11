package com.tew.dto;

import java.util.List;

public class SchoolJobListDTO {
    private List<SchoolJobTemp> list;

    @Override
    public String toString() {
        return "SchoolJobListDTO{" +
                "list=" + list +
                '}';
    }

    public List<SchoolJobTemp> getList() {
        return list;
    }

    public void setList(List<SchoolJobTemp> list) {
        this.list = list;
    }

    public SchoolJobListDTO() {
    }

    public SchoolJobListDTO(List<SchoolJobTemp> list) {
        this.list = list;
    }
}
