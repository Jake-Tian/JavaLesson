public class TestWhile4 {

    public static void main(String[] args) {

        // 使用for循环，打印a-z的26个字母
        char c = 'a';
        for (int i = 0; i<26; i++) {
            System.out.print(c+",");
            c ++;
        }

        System.out.println();

        // 打印一个9*9乘法表
        for (int i = 1; i<=9; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i + " * " + j + " = " + i*j+"\t");
            }
            System.out.println();
        }
    }
}
