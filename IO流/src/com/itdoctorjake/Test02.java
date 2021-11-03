package com.itdoctorjake;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用try-catch-finally经典语法结构，测试流使用！
 */
public class Test02 {

    public static void main(String[] args) {

    }

    public static void readFile() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c:/b.txt");

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

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 流对象用完后，必须关闭！不然，总占用系统资源，最终会造成系统奔溃！
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFile() {
        // 暂时只测试英文，不测试中文

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("c:/c.txt");

            fos.write('a');
            fos.write('b');
            fos.write('c');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
