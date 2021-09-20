public class TestBreakContinue {

    public static void main(String[] args) {
        /*
        开发一个抓动物小游戏
        每次随机出现一个动物。
        如果出现老虎，则游戏结束；如果出现老鹰，躲起来，等待下一个动物出现。
        如果出现小猫、小狗、小鸟、小乌龟等，可以抓住。计数，抓住多少个动物
        0: 老虎  1：老鹰  2：小猫  3：小狗  4：小鸟
         */
        int count = 0; // 计数器，记录抓住动物的数量

        for (;;) {
            int num = (int) (Math.random()*5);
            String animal = "";

            switch (num) {
                case 0:
                    animal = "老虎";
                    break;
                case 1:
                    animal = "老鹰";
                    break;
                case 2:
                    animal = "小猫";
                    break;
                case 3:
                    animal = "小狗";
                    break;
                case 4:
                    animal = "小鸟";
                    break;
                default:
                    animal = "未知";
                    break;
            }

            if (animal == "老虎") {
                System.out.println("老虎来啦！不玩了，赶紧跑吧！");
                break;
            } else if (animal == "老鹰") {
                System.out.println("老鹰来啦！躲起来，看下一个出来什么动物");
            } else {
                System.out.println("抓住了一只可爱的"+animal);
                count ++;
                System.out.println("一共抓住动物的数量："+count);
            }
        }

    }
}
