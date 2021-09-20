/**
 * 测试方法的重载
 */

public class TestOverload {

    public static void main(String[] args) {

    }

    /** 求和的方法 */
     public static int add (int a, int b) {
         return a+b;
     }

     // 方法名相同，参数类型不同，构成重载
    public static double add (double a, int b) {
         return a+b;
    }

    // 方法名相同，参数个数不同，构成重载
    public static int add (int a, int b, int c) {
        return a+b+c;
    }

    // 方法名相同，参数顺序不同，构成重载
    public static double add (int a, double b) {
         return a+b;
    }

    // 编译错误：只有返回值不同，不构成重载
//    public static void add (int a, int b) {
//         return a+b;

    // 编译错误：只有参数名称不同，不构成重载
//    public static int add (int n1, int n2) {
//        return n1+n2;
    }

