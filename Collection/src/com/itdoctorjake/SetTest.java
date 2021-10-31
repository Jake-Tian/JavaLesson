package com.itdoctorjake;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 测试Set
 * Set: 无序，不可重复
 */
public class SetTest {

    public static void main(String[] args) {
        test02();
    }

    // Set的常用方法
    public static void test01() {
        Set s = new HashSet();
        s.add("hello");
        s.add("world");
        System.out.println(s);
        s.add("hello");     // 相同的元素不会再被加入
        System.out.println(s);

        // 其他方法和List一致，因为Set和List都是Collection接口的子接口
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }

    // Set中不可重复的核心，equals()方法
    public static void test02() {
        Emp e1 = new Emp(1001, "张三");
        Emp e2 = new Emp(1002, "李四");
        Emp e3 = new Emp(1001, "王五");

        Set s = new HashSet();
        s.add(e1);
        s.add(e2);
        s.add(e3);

        System.out.println(s);
    }
}

class Emp {
    private int id;
    public String ename;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Emp(int id, String ename) {
        this.id = id;
        this.ename = ename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                '}';
    }
}