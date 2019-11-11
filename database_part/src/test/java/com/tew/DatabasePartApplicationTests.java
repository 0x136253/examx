package com.tew;

import com.tew.dao.PermissMapper;
import com.tew.dao.UserMapper;
import com.tew.pojo.Permiss;
import com.tew.service.PermissDAO;
import com.tew.service.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabasePartApplicationTests {
    @Autowired
    private UserDAO userDAO;

    @Resource
    private PermissDAO permissDAO;
    @Test
    public void test1(){
        System.out.println(userDAO.selectByPrimaryKey("2019082415193421"));
    }


    @Test
    public void test2(){
        System.out.println(userDAO.selectByIcNumber("330621199903121519"));
    }

    @Test
    public void test3(){
        System.out.println(userDAO.selectByTel("12345678901"));
    }

    @Test
    public void test4(){
        Permiss permiss = new Permiss();
        permiss.setId("XXXX");
        permiss.setDbpermiss("sada");
        permiss.setDescription("sada");
        permiss.setEnable((short)1);
        permiss.setFcpermiss("sadad");
        permiss.setGetTime(new Date());
        permiss.setEndTime(new Date());
        permissDAO.insertSelective(permiss);
    }

    @Test
    public void test5(){
        List<Permiss> list = permissDAO.selectById("2019082415193421");
        System.out.println(list.get(0));
    }
}
