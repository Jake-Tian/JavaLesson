package Homework;

import java.security.spec.ECParameterSpec;
import java.util.Objects;

public class Exercise26 {

    public static void main(String[] args) {

        Employee e1 = new Employee(1001, "Jake");
        Employee e2 = new Employee(1001,"Yizhou");

        System.out.println(e1);

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }

    public static class Employee extends Object {
        int id;
        String name;

        Employee (int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "id：" + id +
                    "，姓名：" + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
