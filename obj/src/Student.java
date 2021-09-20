public class Student {

    // 静态特征 （数据）
    int id;
    String name;
    int score;
    int age;

    // 方法（动态行为）（对数据的操作）
    public void study () {
        System.out.println("正在学习："+name);
    }

    // main方法是程序的入口
    public static void main(String[] args) {
        Student stu01 = new Student();
        stu01.id = 193;
        stu01.name = "Jake";
        stu01.score = 100;
        stu01.age = 18;

        Student stu02 = new Student();
        stu02.id = 1002;
        stu02.name = "Martin";
        stu02.score = 98;
        stu02.age = 18;

        Student stu03 = new Student();

        stu01.study();
        stu02.study();
    }
}
