/**
 * 测试switch语句
 */

package Homework;

public class Exercise10 {

    public static void main(String[] args) {

        int weekday = (int) (Math.random()*7);
        System.out.println("随机数："+weekday);

        switch (weekday) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday night is alright for fightin'");
                break;
        }

    }
}
