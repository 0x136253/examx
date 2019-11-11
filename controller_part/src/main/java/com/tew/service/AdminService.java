package com.tew.service;

import com.tew.dto.RegisterDTO;
import com.tew.dto.UpdatepasswordDTO;
import com.tew.pojo.Person;
import com.tew.pojo.User;

public interface AdminService {

    public String login(String username,String password);
    User getAdminByUsername(String username);
    User register(User umsAdminParam, Person person);
    void logout(String username);
    boolean updatepassword(UpdatepasswordDTO updatepasswordDTO);
}
