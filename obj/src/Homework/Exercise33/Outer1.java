package Homework.Exercise33;

public class Outer1 {
    private int age = 18;
    public void show() {
        System.out.println("外部类，age："+age);
    }

    // 内部类。定义在外部类Outer1里面
    // 非静态内部类不能有静态的方法、静态的属性、静态初始化块
    class Inner1 {
        private int id = 1001;
        private int age = 28;

        public void test1() {
            System.out.println("Inner1.test1");
            System.out.println("内部类的属性，age："+this.age);
            System.out.println("外部类的属性，age："+Outer1.this.age);  // 通过：外部类名.this.属性名，访问外部类的属性
            Outer1.this.show();
        }
    }
}
