/**
 * 测试接口的语法，基本用法
 */
public class TestInterface {

    public static void main(String[] args) {
        Angle a = new Angle();
        a.fly();
        a.helpOthers();
        Honest h = new Angle();
        h.helpOthers();     // 接口可以作为一个类型
    }
}

/**
 * 飞行接口
 */
interface Volant {
    int FLY_HEIGHT = 100;   // public static final
    void fly();     // public abstract void fly();
}

/**
 * 善良接口
 */
interface Honest {
    void helpOthers();
}

class Angle implements Volant,Honest {

    @Override
    public void fly() {
        System.out.println("我是天使，飞呀飞呀！");
    }

    @Override
    public void helpOthers() {
        System.out.println("我是天使，喜欢扶老奶奶过马路");
    }
}

class BirdMan implements Volant {

    @Override
    public void fly() {
        System.out.println("我是鸟人！像鸟一样飞！");
    }
}
