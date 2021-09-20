/**
 * 测试嵌套循环
 */

public class TestWhile2 {

    public static void main(String[] args) {

        // 打印输出10行，每行输出0-9
        for (int i = 0; i<10; i++) {
            for (int m=0; m<10; m++) {
                System.out.print(m+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                if (j%2 == 0) {
                    System.out.print("图\t");
                } else {
                    System.out.print("文\t");
                }
            }
            System.out.println();
        }





    }
}
