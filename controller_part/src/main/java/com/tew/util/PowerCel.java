package com.tew.util;

import com.tew.service.PermissDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PowerCel {
    @Autowired
    private PermissDAO permissDAO;

    public void check(String fun,String have){

    }
}
