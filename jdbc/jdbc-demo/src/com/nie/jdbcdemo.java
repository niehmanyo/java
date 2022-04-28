package com.nie;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/*jdbc  入门*

psvm 直接生成 public static void main
 */
public class jdbcdemo  {
    public static void main(String[] args) throws Exception{
        //1. 注册驱动
        Class.forName("com.nie.jdbcdemo");

        //2.
        String url = "jdbc:mysql://127.0.0.1:133/db1";//固定写法
        String username="root";
        String passwd="nwy0522.";
        Connection con = DriverManager.getConnection(url,username,passwd);
    }
}
