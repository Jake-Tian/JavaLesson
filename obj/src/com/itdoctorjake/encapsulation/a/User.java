package com.itdoctorjake.encapsulation.a;

public class User {

    private int id;
    private String name;
    private String pwd;
    boolean admin;      // 是不是超级管理员

    public boolean isAdmin() {
        return admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
