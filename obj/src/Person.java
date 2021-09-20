public class Person {

    String name;
    int age;

    public void show () {
        System.out.println("姓名："+name+"\t年龄："+age);
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person () {

    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 18;
        p1.name = "Jake";
        p1.show();

        Person p2 = new Person ("张三",24);
        p2.show();
    }
}
