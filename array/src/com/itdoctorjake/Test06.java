package com.itdoctorjake;

import java.util.Arrays;

/**
 * 测试二维数组：利用Object数组存储表格信息
 */
public class Test06 {

    public static void main(String[] args) {
        Object[] a1 = {1001,"高淇",18,"讲师","2021-10-8"};  // 包装类
        Object[] a2 = {1002, "高小七",19,"助教","2021-4-15"};
        Object[] a3 = {1003, "高小八",20,"班主任","2021-3-15"};

        System.out.println(Arrays.toString(a1));
        Object[][] emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;

        for (int i = 0; i<emps.length; i++) {
            System.out.println(Arrays.toString(emps[i]));
        }

        Emp e1 = new Emp(1001,"高淇",18,"讲师","2021-10-8");
        Emp e2 = new Emp(1002, "高小七",19,"助教","2021-4-15");
        Emp e3 = new Emp(1003, "高小八",20,"班主任","2021-3-15");

        Emp[] employees = {e1,e2,e3};
        for (Emp emp : employees) {
            System.out.println(emp);
        }
    }
}

class Emp {
    private int id;
    private String name;
    private int age;
    private String job;
    private String hireDate;

    public Emp(int id, String name, int age, String job, String hireDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
