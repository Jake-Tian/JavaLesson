import java.util.Scanner;

/**
 * 年薪计算小软件
 */

public class SalarySoftware {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("年薪计算小软件");

        while (true) {
            System.out.println("请输入月薪：");
            int monthSalary = scanner.nextInt();
            System.out.println("请输入一年多少个月薪资：");
            int months = scanner.nextInt();
            int annualSalary = monthSalary * months;

            System.out.println("您的年薪是："+annualSalary);

            if (annualSalary >= 10000 && annualSalary <= 20000) {
                System.out.println("您表现不错，已经超过90%国人！");
            } else if (annualSalary >= 20000) {
                System.out.println("您表现不错，已经超过98%的国人");
            } else {
                System.out.println("继续努力哦");
            }

            System.out.println("请输入命令1[退出],2[继续]");
            int commandNum = scanner.nextInt();
            if (commandNum == 1) {
                System.out.println("退出软件");
                break;
            } else if (commandNum == 2) {
                System.out.println("请重新输入数据");
                continue;
            }
        }
    }
}
