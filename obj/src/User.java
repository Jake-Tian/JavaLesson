/**
 * 模拟网站的账户（用于测试构造方法的重载
 */

public class User {

    int id;
    String uname; // 用户名
    String pwd; // 密码

    User () {}

    public User (int _id) {
        id = _id;
    }

    public User (int _id, String _uname, String _pwd) {
        id = _id;
        uname = _uname;
        pwd = _pwd;
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User (1001);
        User u3 = new User (1002, "Jake", "123456");
    }
}
