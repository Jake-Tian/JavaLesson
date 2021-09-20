public class TestWhile {

    public static void main(String[] args) {

//        int i = 1;
//        while (i<=100) {
//            System.out.println(i);
//            i++;
//        }

        // 计算1+2+3+...+100
        int i = 0;
        int sum = 0;
        while (i<=100) {
            sum += i;
            i++;
        }
        System.out.println("和："+sum);
    }
}
