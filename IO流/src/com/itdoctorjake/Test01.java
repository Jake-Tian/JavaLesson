package com.itdoctorjake;

import java.io.*;

/**
 * 仅用于测试！代码不规范！下一节我们再讲最规范的写法！
 */
public class Test01 {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try {
            FileInputStream fis = new FileInputStream("c:/b.txt");

            int s1 = fis.read();
            int s2 = fis.read();
            int s3 = fis.read();
            int s4 = fis.read();
            int s5 = fis.read();    // 由于文件内容已经读取完毕，返回-1

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);

            // 流对象用完后，必须关闭！不然，总占用系统资源，最终会造成系统奔溃！
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        // 暂时只测试英文，不测试中文

        try {
            FileOutputStream fos = new FileOutputStream("c:/c.txt");

            fos.write('a');
            fos.write('b');
            fos.write('c');

            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
