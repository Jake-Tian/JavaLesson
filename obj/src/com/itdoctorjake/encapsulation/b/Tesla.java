package com.itdoctorjake.encapsulation.b;

import com.itdoctorjake.encapsulation.a.Car;

public class Tesla extends Car {
    void test () {
        // super.check();       // 不能访问其他类的私有
        // super.addOil();      // 不同的包,不能访问default
        super.autoLighten();    // 不在同一个包的子类，也可以访问protected
        super.run();            // 任何类都能访问public
    }
}
