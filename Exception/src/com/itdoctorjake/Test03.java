package com.itdoctorjake;

/**
 * 测试自定义异常
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setAge(-80);
    }
}

/**
 * 不合法年龄异常。
 */
class IllegalAgeException extends Exception{    // extends RuntimeException

    public IllegalAgeException() {}

    public IllegalAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public void setAge(int age) throws IllegalAgeException{
        if (age<0) {
            throw new IllegalAgeException("人的年龄不能是复数");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
