package com.tew.controller;


import com.tew.api.MyLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@CrossOrigin
@Controller
@RequestMapping("/")
public class HomeController {
//
//
//    @MyLog(operation = "USER登陆")
//    @RequestMapping("ROLE_USER")
//    @ResponseBody
//    public String ROLE_USER(){
//        return "success";
//    }
//
//
//
//    @MyLog(operation = "ADMIN登陆")
//    @RequestMapping("ROLE_ADMIN")
//    @ResponseBody
//    public String ROLE_ADMIN(){
//        return "success";
//    }
//
//
//    @MyLog(operation = "SYSTEM登陆")
//    @RequestMapping("ROLE_SYSTEM")
//    @ResponseBody
//    public String ROLE_SYSTEM(){
//        return "success";
//    }
}
