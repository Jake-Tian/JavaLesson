package com.itdoctorjake.encapsulation.a;

public class TestA {

    public static void main(String[] args) {
        Car c = new Car ();
        // c.check();
        c.addOil();
        c.autoLighten();
        c.run();

        User u = new User();
        u.setId(100);
        System.out.println(u.getId());
    }
}
