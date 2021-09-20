package com.itdoctorjake.encapsulation.b;

import com.itdoctorjake.encapsulation.a.Car;

public class TestB {

    public static void main(String[] args) {
        Car c = new Car ();
        // c.check();
        // c.addOil();
        // c.autoLighten();     // protected. 子类和父类不在同一个包，子类可以访问父类的protected,不能直接访问父类对象的protected
        c.run();
    }
}
