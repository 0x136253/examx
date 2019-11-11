package com.tew.service.Impl;

import com.tew.dto.UpdatepasswordDTO;
import com.tew.pojo.Person;
import com.tew.pojo.User;
import com.tew.service.AdminService;
import com.tew.service.Token_redisService;
import com.tew.service.UmsAdminService;
import com.tew.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminService.class);
    @Autowired
    private UmsAdminService umsAdminService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private Token_redisService token_redisService;
    @Override
    public String login(String username, String password) {
        UserDetails userDetails = umsAdminService.login(username,password);
        try{
            if(userDetails == null){
                throw new BadCredentialsException("密码不正确");
            }
            else{
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
            return null;
        }
        return jwtTokenUtil.generateToken(userDetails);
    }

    @Override
    public User getAdminByUsername(String username) {
        return umsAdminService.getAdminByUsername(username);
    }

    @Override
    public User register(User umsAdminParam, Person person) {
        String Ic=umsAdminParam.getIcNumber();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String date= formatter.format(new Date());
        date=date+Ic.substring(15,18);
        umsAdminParam.setId(date);
        person.setId(date);
        return umsAdminService.register(umsAdminParam,person);
    }

    @Override
    public void logout(String username) {
        token_redisService.delete(username);
    }

    @Override
    public boolean updatepassword(UpdatepasswordDTO updatepasswordDTO) {
        token_redisService.delete(updatepasswordDTO.getIcNumber());
        return umsAdminService.updatepassword(updatepasswordDTO.getIcNumber(),updatepasswordDTO.getNewpassword());
    }
}
