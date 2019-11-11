package com.tew.service;

import java.util.Date;
import java.util.List;

public interface DateInService {
    public boolean dateinexam(String url, int themeid, String description, Date time);
    public boolean dateinscore(String url,int themeid,String clazz);
    public boolean dateinscoreset(String url,int themeid,String clazz);
    public boolean dataincheckg(String url,int themeid);
    public boolean datainchecknet(int themeid, List<String> id,List<String> idnotpass);
}
