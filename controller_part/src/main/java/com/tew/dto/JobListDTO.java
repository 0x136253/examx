package com.tew.dto;

public class JobListDTO {
    private String clazz;
    private String post;

    @Override
    public String toString() {
        return "JobListDTO{" +
                "clazz='" + clazz + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public JobListDTO() {
    }

    public JobListDTO(String clazz, String post) {
        this.clazz = clazz;
        this.post = post;
    }
}
