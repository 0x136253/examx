package com.tew.dto;

import com.tew.pojo.Wish;

public class WishDTO {
    private String id;
    private String schoolname;
    private String post;
    private Short themeID;


    public Wish wish_get(){
        Wish wish = new Wish();
        wish.setThemeid(themeID);
        wish.setSchoolName(schoolname);
        wish.setPost(post);
        wish.setId(id);
        return wish;
    }
    @Override
    public String toString() {
        return "WishDTO{" +
                "id='" + id + '\'' +
                ", schoolname='" + schoolname + '\'' +
                ", post='" + post + '\'' +
                ", themeID=" + themeID +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Short getThemeID() {
        return themeID;
    }

    public void setThemeID(Short themeID) {
        this.themeID = themeID;
    }

    public WishDTO() {
    }

    public WishDTO(String id, String schoolname, String post, Short themeID) {
        this.id = id;
        this.schoolname = schoolname;
        this.post = post;
        this.themeID = themeID;
    }
}
