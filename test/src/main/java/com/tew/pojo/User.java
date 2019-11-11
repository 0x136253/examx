package com.tew.pojo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private List<Role> roles;
    private List<Permiss> permisses;

    public User(int id, String username, String password, List<Role> roles, List<Permiss> permisses) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permisses = permisses;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", permisses=" + permisses +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Permiss> getPermisses() {
        return permisses;
    }

    public void setPermisses(List<Permiss> permisses) {
        this.permisses = permisses;
    }
}
