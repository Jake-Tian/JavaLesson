package com.itdoctorjake.abstractClass;

// 模板方法模式（抽象类的应用）
public abstract class DBOperator {
    // 1. 建立连接  2. 打开数据库    3. 使用数据库    4. 关闭连接
    public abstract void connection();
    public void open() {
        System.out.println("打开数据库");
    }
    public void use() {
        System.out.println("使用数据库");
    }
    public void close() {
        System.out.println("关闭连接");
    }

    public void process() {
        connection();
        open();
        use();
        close();
    }

    public static void main(String[] args) {
        new MySqlOperator().process();
        new OracleOperation().process();
    }
}

class MySqlOperator extends DBOperator {

    public void connection() {
        System.out.println("建立和Mysql数据库的连接");
    }
}

class OracleOperation extends DBOperator {

    public void connection() {
        System.out.println("建立和Oracle数据库的连接 ");
    }
}
