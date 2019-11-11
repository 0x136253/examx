package com.tew;

import com.tew.pojo.Theme;
import com.tew.pojo.User;
import com.tew.service.AdminService;
import com.tew.service.GetPostInService;
import com.tew.service.UmsAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerPartApplicationTests {
    @Autowired
    private AdminService adminService;

    @Autowired
    private UmsAdminService umsAdminService;

    @Autowired
    private GetPostInService getPostInService;

    @Test
    public void contextLoads() {
        User user=umsAdminService.getAdminByUsername("Anon2");
        System.out.println(user);
    }

    @Test
    public void login(){
        String token =adminService.login("Anon2","Anon2");
        System.out.println(token);
    }

    @Test
    public void test1(){
        Theme theme =new Theme();
        theme.setTheme("fall in");
        theme.setUserfulTime("2019.9-2019.12");
        theme.setDescription("need person");
        theme.setSchoolin("7894,8978");
        theme.setSchoolinid("7897,4564");
        theme.setRequest("bengke");
        theme.setEndTime(new Date());
        getPostInService.GetThemeIn(theme);
    }

    @Test
    public void test2(){
        Theme theme=getPostInService.showThemeByID((short) 1);
        System.out.println(theme);
    }
}
