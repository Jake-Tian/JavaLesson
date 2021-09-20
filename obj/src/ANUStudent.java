public class ANUStudent {

    int id;
    String sname;
    int age;
    Computer computer;

    void study () {
        System.out.println("我正在学习！使用的电脑是："+computer.brand);
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.brand = "lenovo";
        c1.price = 6000;

        Computer c2 = new Computer();
        c2.brand = "dell";
        c2.price = 5000;

        ANUStudent stu1 = new ANUStudent();
        stu1.id = 1001;
        stu1.sname = "Jake";
        stu1.age = 18;
        stu1.computer = c1;

        stu1.study();
    }
}
