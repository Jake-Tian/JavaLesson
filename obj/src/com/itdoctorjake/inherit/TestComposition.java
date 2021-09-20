package com.itdoctorjake.inherit;

/**
 * 测试组合
 */

public class TestComposition {
    public static void main(String[] args) {
        Stu stu = new Stu("Jake", 174, "Java");
        stu.person.rest();
        System.out.println(stu.person.name);
        System.out.println(stu.person.height);
        System.out.println(stu.major);
    }
}

class Stu {
    Person person = new Person();
    String major;

    public void study() {
        System.out.println("Student is studying");
    }

    public Stu(String name, int height, String major) {
        this.person.name = name;
        this.person.height = height;
        this.major = major;
    }
}

class CPU {
    void calculate () {
        System.out.println("CPU is calculating");
    }
}

class Memory {
    void store () {
        System.out.println("Memory is storing");
    }
}

class Computer {
    CPU cpu = new CPU();
    Memory memory = new Memory();
}