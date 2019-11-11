package com.tew;

import com.tew.pojo.*;
import com.tew.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicePartApplicationTests {

    @Autowired
    private PermissDAO permissDAO;

    @Resource
    private UserDAO userDAO;

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private WishDAO wishDAO;
    @Autowired
    private Token_redisService token_redisService;
    @Autowired
    private UmsAdminService umsAdminService;


    @Test
    public void test(){
        Permiss permiss=permissDAO.selectByPrimaryKey((short)1);
        System.out.println(permiss);
    }

    @Test
    public void contextLoads() {
        User user = userDAO.selectByIcNumber("330621199903121519");
        System.out.println(user);
    }


    @Test
    public void text(){
        User user = new User();
        user.setIcNumber("20190822789455555");
        user.setPassword("20190822");
 //       umsAdminService.register(use);
    }

    @Test
    public void text2(){
        Person person = personDAO.selectByPrimaryKey("2019082415193421");
        System.out.println(person);
    }

    @Test
    public void text3(){
        PersonExample personExample= new PersonExample();
        personExample.createCriteria().andNameEqualTo("孙蒙达");
        List<Person> list=personDAO.selectByExample(personExample);
        for(Person item:list){
            System.out.println(item);
        }
    }

    @Test
    public void text4() {
        //token_redisService.add("78979789798798798","123456");
        if(token_redisService.vavlid("123456","789798798798")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    @Test
    public  void test5(){
        Wish wish = new Wish();
        wish.setId("2017329600117");
        wish.setPost("4545");
        wish.setPostid((short)4);
        wish.setSchoolid((short)4);
        wish.setSchoolName("8797");
        wish.setThemeid((short) 1);
        wishDAO.insertSelective(wish);
    }

    }
