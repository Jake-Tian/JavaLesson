public class TestWhile3 {

    public static void main(String[] args) {

        // 输出一个直角三角形

        for (int m = 0; m<6; m++) {
            for (int n = 0; n<m; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("====================================");

        // 输出一个倒立的直角三角形
        for (int m = 0; m<5; m++) {
            for (int n = 0; n<5-m; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("====================================");

        // 输出一个等腰三角形
        int num = 5;    // 初始位置
        for (int m = 0; m<5; m++) {
            for (int n = 0; n<10; n++) {
                if (n>=num-m && n<=num+m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
