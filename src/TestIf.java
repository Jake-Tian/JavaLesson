/**
 * 测试if语句
 */


public class TestIf {

    public static void main(String[] args) {

        // System.out.println(Math.random()); // [0,1)随机数
        // [0,10)随机整数
        int r = (int) (Math.random()*10);
        System.out.println(r);

        // 如果r小于5，则打印“数比较小”
        if (r<5) {
            System.out.println("数比较小");
        }
        else {
            System.out.println("数比较大");
        }

        // 生成一个在【0，100】表示年龄的随机数。
        // 15岁一下儿童，15-24青年，25-44中老年，65-84老年，85以上老寿星
        int age = (int)(Math.random()*100);
        System.out.println("年龄："+age);
        if (age<15) {
            System.out.println("儿童，好好玩！");
        } else if (age<25) {
            System.out.println("青年，好好学习！");
        } else if (age<45) {
            System.out.println("中年，好好工作！");
        } else if (age<65) {
            System.out.println("中老年，还是好好工作！");
        } else if (age<85) {
            System.out.println("老年，好好休息");
        } else {
            System.out.println("老寿星");
        }


    }

}
