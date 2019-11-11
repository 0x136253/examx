package com.tew.dto;

public class CheckinDTO {
    private String url;
    private short themeid;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public short getThemeid() {
        return themeid;
    }

    public void setThemeid(short themeid) {
        this.themeid = themeid;
    }

    @Override
    public String toString() {
        return "CheckinDTO{" +
                "url='" + url + '\'' +
                ", themeid=" + themeid +
                '}';
    }
}
