package com.tew.service;

import com.tew.pojo.User;

import java.util.List;

public interface UserDAOService {
    public List<User> findAll();

    public User findByName(String username);

    public void insertUser(User user);

    public void insertURR(int user_id, int role_id);

    public void insertRPR(int role_id, int permiss_id);

    public int getIdByUsername(String username);
}
