public class TestIf2 {

    public static void main(String[] args) {

        // 随机生成a-z的字母，如果是a,e,i,o,u，则输出“元音”，否则“辅音”
        int num = (int) (Math.random()*26);
        char letter = 'a';
        letter = (char) (letter+num);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("元音：" +letter);
        } else {
            System.out.println("辅音：" +letter);
        }
    }
}
