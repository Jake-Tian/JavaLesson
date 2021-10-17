package Homework;

public class Exercise34 {

    public static void main(String[] args) {

        int[] a = {200,100,90,65,156};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 100) System.out.println(a[i]);
        }

        for (int temp : a) {
            if (temp > 100) System.out.println(temp);
        }
    }

}
