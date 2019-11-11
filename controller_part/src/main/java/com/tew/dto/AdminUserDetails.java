package com.tew.dto;


import com.tew.pojo.Permiss;
import com.tew.pojo.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdminUserDetails implements UserDetails {
    private User umsAdmin;
    private List<Permiss> permissionList;

    public User getUmsAdmin() {
        return umsAdmin;
    }

    public void setUmsAdmin(User umsAdmin) {
        this.umsAdmin = umsAdmin;
    }

    public List<Permiss> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permiss> permissionList) {
        this.permissionList = permissionList;
    }

    public AdminUserDetails(){

    }
    public AdminUserDetails(User umsAdmin, List<Permiss> list) {
        this.umsAdmin = umsAdmin;
        this.permissionList = list;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println(permissionList.get(0));
        //返回当前用户的权限
        return permissionList.stream()
                .filter(permission -> permission.getFcpermiss()  !=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getFcpermiss()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getIcNumber();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
     //   return umsAdmin.getStatus().equals(1);
        return true;
    }
}
