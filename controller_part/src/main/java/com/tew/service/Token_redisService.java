package com.tew.service;

public interface Token_redisService {
    public boolean vavlid(String IcNumber, String token);
    public void add(String token, String IcNumber);
    public void delete(String IcNumber);
}
