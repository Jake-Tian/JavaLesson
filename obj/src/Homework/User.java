package Homework;

public class User {

    int id;
    String name;
    String pwd;

    public User () {

    }

    public User (int id, String name) {
        System.out.println("正在要初始化的对象："+this);
        this.id = id;
        this.name = name;
    }

    public User (int id, String name, String pwd) {
        this (id, name);
        this.pwd = pwd;
    }

    public void login () {
        System.out.println("要登录："+this.name+"密码："+this.pwd);
    }

    public static void main(String[] args) {
        User u1 = new User (101, "Jake");
        u1.login();

        User u2 = new User (102, "Martin", "123456");
        System.out.println(u2.pwd);
        System.out.println(u2.name);
    }

}
