package com.tew.service;

import com.tew.pojo.Person;
import com.tew.pojo.User;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * 后台管理员Service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
     User getAdminByUsername(String username);

    /**
     * 注册功能
     */
    User register(User umsAdminParam, Person person);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    UserDetails login(String username, String password);

    boolean updatepassword(String username,String newpassword);
}
