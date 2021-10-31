package com.itdoctorjake;

import java.util.*;

/**
 * 测试Map的使用方式
 */
public class MapTest {

    public static void main(String[] args) {
        test03();
    }

    public static void test01() {
        Map m1 = new HashMap();

        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");

        m1.put(2,"二");      // 如果键重复(equals()为核心进行判断), 则替换掉旧的键值对

        System.out.println(m1.get(2));
        System.out.println(m1);

        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey(4));
        System.out.println(m1.containsValue("three"));

        m1.remove(3);   // 从Map容器中移除
        System.out.println(m1);

        Map m2 = new HashMap();
        m2.put("yi", "1111");
        m2.put("er", "2222");
        m2.put(3, "3333");

        m1.putAll(m2);
        System.out.println(m1);     // List里的addAll()
    }

    public static void test02() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        String str = list.get(0);
        System.out.println(str);

        Set<Integer> set = new HashSet<>();
        // set.add("dddd");

        Map<String, String> map = new HashMap<>();
        map.put("一", "one");
        map.put("二", "two");
    }

    // 遍历List, Set
    public static void iterateListSet() {
        // List<String> s = new ArrayList<>();
        Set<String> s = new HashSet<>();
        s.add("aa");
        s.add("bb");
        s.add("cc");

        // 通过索引遍历List (只适用于list)
//        for (int i = 0; i < s.size(); i++) {
//            String temp = s.get(i);
//            System.out.println(temp);
//        }

        // 增强for循环（foreach） (适用于list，set)
        for (String temp : s) {
            System.out.println(temp);
        }

        // 使用Iterator对象 (适用于list，set)
        for (Iterator<String> iter = s.iterator(); iter.hasNext();) {
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    // 遍历Map (遍历key，遍历value)
    public static void test03() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");

        Set<String> keys = map.keySet();
        for (String temp : keys) {
            System.out.println(temp);
            System.out.println(map.get(temp));
        }

        Collection<String> values = map.values();
        for (String temp : values) {
            System.out.println(temp);
        }

        // 使用EntrySet遍历key，value
        Set<Map.Entry<String,String>> entrySet = map.entrySet();

        for (Map.Entry e : entrySet) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
