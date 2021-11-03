package com.itdoctorjake;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * try-with-resource使用流对象
 */
public class Test03 {

    public static void main(String[] args) {

    }

    public static void readFile() {

        try (FileInputStream fis = new FileInputStream("c:/b.txt");){

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
        }
    }

    public static void writeFile() {
        // 暂时只测试英文，不测试中文

        try (FileOutputStream fos = new FileOutputStream("c:/b.txt");) {

            fos.write('a');
            fos.write('b');
            fos.write('c');

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
