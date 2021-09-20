/**
 * this 的用法测试
 */

public class User2 {

    int id;
    String name;
    String pwd;

    public User2() {

    }

    public User2 (int id, String name) {
        System.out.println("正在要初始化的对象："+this);
        this.id = id;
        this.name = name;
    }

    public User2 (int id, String name, String pwd) {
        this (id,name);     // 调用了重载的构造器，这种调用必须位于构造方法的第一行！
        this.pwd = pwd;
    }

    public void login () {
        System.out.println("要登录："+this.name+"，密码："+this.pwd);
    }

    public static void main(String[] args) {
        User2 u = new User2(101, "Jake");
        u.login();

        User2 u2 = new User2(102, "Martin", "123456");
        System.out.println(u2.pwd);
        System.out.println(u2.name);
    }
}
