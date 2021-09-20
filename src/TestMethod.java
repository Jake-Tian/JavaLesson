/**
 * 测试方法的定义和调用
 */

public class TestMethod {
    /** main方法：程序的入口 */
    public static void main(String[] args) {
        // 调用时，实际传递的参数（实参）
        int a1 = add (100,200);
        int a2 = add (200, 300);
        int a3 = add (300, 400);

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        printName();
        printName();
        printName();
    }

    // Method:两个数的求和
    public static int add (int x, int y /*形式参数*/ ) {
        int sum = x + y;
        return sum;
    }

    // Method：打印名字
    public static void printName () {
        System.out.println("Jake");
    }
}
