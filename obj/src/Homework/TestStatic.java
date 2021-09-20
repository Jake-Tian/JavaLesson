package Homework;

public class TestStatic {

    static String company = "SeiJin";
    static int companyId = 0;

    static {
        System.out.println("类被初始化的调用");
        companyId = 111222;
    }

    static void printCompany () {
        System.out.println(company);
    }

    void login() {
        System.out.println("登录");
    }

    public static void main(String[] args) {
        TestStatic.printCompany();
        TestStatic t1 = new TestStatic();
        t1.login();
        TestStatic t2 = new TestStatic();
        t2.login();
    }
}
