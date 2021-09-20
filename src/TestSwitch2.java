public class TestSwitch2 {

    public static void main(String[] args) {

        // 把阿拉伯数字转化成大写汉字 eg.1 -> 壹
        System.out.println("阿拉伯数字和汉字转化器");

        int num = (int) (Math.random() * 10);
        System.out.println("阿拉伯数字："+num);
        char s;

        switch (num) {
            case 0:
                s = '零';
                break;
            case 1:
                s = '壹';
                break;
            case 2:
                s = '贰';
                break;
            case 3:
                s = '叁';
                break;
            case 4:
                s = '肆';
                break;
            case 5:
                s = '伍';
                break;
            case 6:
                s = '陆';
                break;
            case 7:
                s = '柒';
                break;
            case 8:
                s = '捌';
                break;
            default:
                s = '玖';
                break;
        }
        System.out.println("大写汉字："+s);

        // 超级管理员：1，普通用户：2，游客：3
        String role = "超级管理员";
        int roleNum = 0;
        switch (role) {
            case "超级管理员":
                roleNum = 1;
                break;
            case "普通用户":
                roleNum = 2;
                break;
            default:
                roleNum = 3;
                break;
        }
        System.out.println(role+"----"+roleNum);

        // 百战超市推出会员积分奖励活动。积分7000以上，奖励苹果20一台；积分5000以上，奖励苹果12一台，积分3000以上，奖励苹果一筐；
        int score = (int) (Math.random () * 10000);
        System.out.println("用户积分："+score);
        switch (score/1000) {
            case 9:
            case 8:
            case 7:
                System.out.println("一等奖：奖励苹果20一台");
                break;
            case 6:
            case 5:
                System.out.println("二等奖：奖励苹果12一台");
                break;
            case 4:
            case 3:
                System.out.println("三等奖，奖励苹果一筐");
                break;
            default:
                System.out.println("无奖励");
                break;
        }
    }
}
