package Homework;

public class Exercise09 {

    public static void main(String[] args) {

        int grade = (int) (Math.random()*100);
        System.out.println("grade = "+grade);

        if (grade < 60) {
            System.out.println("Fail");
        } else if (grade < 70) {
            System.out.println("Pass");
        } else if (grade < 80) {
            System.out.println("Above Average");
        } else if (grade < 90) {
            System.out.println("Excellent");
        } else {
            System.out.println("Genius!");
        }
    }
}
