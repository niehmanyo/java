package com.nie;
import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import  java.lang.Integer;
/*jdbc  入门*

psvm 直接生成 public static void main
 */
public class jdbcdemo  {
    public static void main(String[] args) throws Exception{
        //1. 注册驱动
        Class.forName("com.nie.jdbcdemo");

        //2.

        String url = "jdbc:mysql://localhost:3306/jdbc";//固定写法
        String username="root";
        String passwd="nwy0522.";
        Connection con = DriverManager.getConnection(url,username,passwd);
        System.out.println(con);
        String sql ="SHOW DATABASES";
        Statement statement = con.createStatement();
        int row = statement.executeUpdate(sql);
        System.out.println(row);
    }
}
