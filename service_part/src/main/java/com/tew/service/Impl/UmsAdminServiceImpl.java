package com.tew.service.Impl;

import com.tew.dto.AdminUserDetails;
import com.tew.pojo.*;
import com.tew.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;


@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private PersonDAO personDAO;
    @Autowired
    private SchoolDAO schoolDAO;
    @Autowired
    private ProcessInService processInService;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Resource
    private UserDAO userDAO;
    @Resource
    private PermissDAO permissDAO;


    @Override
    public User getAdminByUsername(String username) {
        User example = new User();
        example = userDAO.selectByIcNumber(username);
        if(example == null){
            example = userDAO.selectByTel(username);
        }
        if (example != null) {
            return example;
        }
        return null;
    }

    @Override
    public User register(User umsAdminParam,Person person) {
        User umsAdmin = new User();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        //     umsAdmin.setCreateTime(new Date());
        //查询是否有相同用户名的用户
        if (userDAO.selectByIcNumber(umsAdminParam.getIcNumber())!=null  || userDAO.selectByTel(umsAdminParam.getTel())!=null) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        userDAO.insert(umsAdmin);
        User user = null;
        user = userDAO.getIdByIcNumber(umsAdmin.getIcNumber());
        String id = user.getId();
        Permiss permiss = new Permiss();
        permiss.setId(user.getId());
        permiss.setEnable((short)1);
        permiss.setPid("2019082478952345");
        permiss.setGetTime(new Date());
        permiss.setEndTime(new Date(System.currentTimeMillis()+1000*60*60*24*3650));
        if(umsAdmin.getRole()==null){
            permiss.setDbpermiss("nullx");
            permiss.setDescription("ROLE_USER默认权限");
            permiss.setFcpermiss("ROLE_USER");
            permissDAO.insertSelective(permiss);
        }
        else if (umsAdmin.getRole().equals("ROLE_SYSTEM")){
            permiss.setDbpermiss("nullx");
            permiss.setDescription("ROLE_ADMIN默认权限");
            permiss.setFcpermiss("ROLE_SYSTEM");
            permissDAO.insertSelective(permiss);
        }
        else if(umsAdmin.getRole().equals("ROLE_ADMIN")){
            permiss.setDbpermiss("nullx");
            permiss.setDescription("ROLE_ADMIN默认权限");
            permiss.setFcpermiss("ROLE_ADMIN");
            permissDAO.insertSelective(permiss);
        }
        else{
            permiss.setDbpermiss("nullx");
            permiss.setDescription("ROLE_USER默认权限");
            permiss.setFcpermiss("ROLE_USER");
            permissDAO.insertSelective(permiss);
        }
        if(person.getRole().equals("ROLE_ADMIN") || person.getRole().equals("ROLE_SYSTEM")){
            SchoolExample schoolExample=new SchoolExample();
            schoolExample.createCriteria().andSchoolNameEqualTo(person.getSchoolName());
            person.setSchoolid(schoolDAO.selectByExample(schoolExample).get(0).getSchoolid());
        }
        personDAO.insert(person);
        Check check = new Check();
        check.setId(person.getId());
        check.setTrialInfo((short)1);
        check.setThemeid((short)0);
        processInService.insert(check);
        return umsAdmin;
    }

    @Override
    public UserDetails login(String username, String password) {
        UserDetails userDetails = null;
        try {
            User user = userDAO.selectByIcNumber(username);
            if(user == null){
                user = userDAO.selectByTel(username);
            }
            if (!passwordEncoder.matches(password, user.getPassword())) {
                System.out.println("your password"+password+" correct:"+ user.getPassword());
                throw new BadCredentialsException("密码不正确");
            }
            userDetails = new AdminUserDetails(user,permissDAO.selectById(user.getId()));
         //   UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
          //  SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return userDetails;
    }

    @Override
    public boolean updatepassword(String username, String newpassword) {
        User user=userDAO.selectByIcNumber(username);
        String password =passwordEncoder.encode(newpassword);
        user.setPassword(password);
        userDAO.updateByPrimaryKey(user);
        return true;
    }
}
