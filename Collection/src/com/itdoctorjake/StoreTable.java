package com.itdoctorjake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用容器的不同方式，存储表格信息
 */
public class StoreTable {
    public static void main(String[] args) {
        test02();
    }

    // Map对应一行数据：
    public static void test01() {
        Map<String,Object> m1 = new HashMap<>();
        m1.put("id",1001);
        m1.put("name", "Alex");
        m1.put("birth", "2021-8-10");
        m1.put("length", 300);

        Map<String,Object> m2 = new HashMap<>();
        m2.put("id",1002);
        m2.put("name", "Bruce");
        m2.put("birth", "2021-9-10");
        m2.put("length", 400);

        Map<String,Object> m3 = new HashMap<>();
        m3.put("id",1003);
        m3.put("name", "Chris");
        m3.put("birth", "2021-10-10");
        m3.put("length", 500);

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        System.out.println("id\t\tname\tbirth\t\tlength");
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> temp = list.get(i);
            System.out.println(temp.get("id")+"\t"
                    +temp.get("name")+"\t"
                    +temp.get("birth")+"\t"
                    +temp.get("length"));
        }
    }

    // List+Javabean的方式
    public static void test02() {
        PersonInfo p1 = new PersonInfo(1001, "Alex", "2021-8-10",300);
        PersonInfo p2 = new PersonInfo(1002, "Bruce", "2021-9-10",400);
        PersonInfo p3 = new PersonInfo(1003, "Chris", "2021-10-10",500);

        List<PersonInfo> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(list);

        System.out.println("id\t\tname\tbirth\t\tlength");
        for (PersonInfo temp : list) {
            System.out.println(temp);
        }
    }
}

class PersonInfo {
    private int id;
    private String name;
    private String birth;
    private int length;     // 秒为单位

    public PersonInfo(int id, String name, String birth, int length) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.length = length;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }


    public String getLength() {
        // 超过60秒，显示几分几秒；超过3600秒，显示几小时几分几秒
        if (this.length<60) {
            return this.length+"秒";
        } else if (this.length<3600) {
            int minutes = length/60;
            int seconds = length%60;
            return minutes+"分"+seconds+"秒";
        } else {
            int hours = length/3600;
            int minutes = (length%3600)/60;
            int seconds = length%60;

            return hours+"时"+minutes+"分"+seconds+"秒";
        }
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + birth + "\t" + getLength();
    }
}
