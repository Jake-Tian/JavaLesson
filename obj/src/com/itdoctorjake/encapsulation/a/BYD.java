package com.itdoctorjake.encapsulation.a;

public class BYD extends Car{

    void test () {
        // super.check();       // 不能访问其他类的私有
        super.addOil();         // 同一个包，可以访问
        super.autoLighten();    // 子类可以访问protected
        super.run();            // 任何类都可以访问public
    }
}
