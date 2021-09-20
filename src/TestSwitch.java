/**
 * 测试switch语句
 */

public class TestSwitch {

    public static void main(String[] args) {

        // grade表示大学年级
        int grade = 1;

        if (grade == 1) {
            System.out.println("Freshman");
        } else if (grade == 2) {
            System.out.println("Sophomore");
        } else if (grade == 4) {
            System.out.println("Junior");
        } else {
            System.out.println("Senior");
        }

        switch (grade) {
            case 1:
                System.out.println("Freshman");
                break;
            case 2:
                System.out.println("Sophomore");
                break;
            case 3:
                System.out.println("Junior");
                break;
            default:
                System.out.println("Senior");
                break;
        }

        int month = 2; // 1表示1月，2表示2月...

        if (month == 1 || month == 2 || month == 3) {
            System.out.println("Spring");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("Summer");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Winter");
                break;
        }

        String car = "Benz";
        // switch表达式接收：整数、枚举、字符串
        switch (car) {
            case "Audi":
                System.out.println("Audi");
                break;
            case "BMW":
                System.out.println("BMW");
                break;
            case "Benz":
                System.out.println("Benz");
                break;
            default:
                System.out.println("Porsche");
                break;
        }
    }
}
