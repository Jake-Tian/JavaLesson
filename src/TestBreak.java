/**
 * 测试break语句
 */

public class TestBreak {

    public static void main(String[] args) {

        // 产生100以内的随机数，直到随机数为88时终止循环

        int count = 0;  //计数器
        while (true) {

            int m = (int) (Math.random()*100);
            System.out.println(m);

            count++;

            if (m==88) {
                break;
            }
        }
        System.out.println("一共循环次数："+count);
    }
}
