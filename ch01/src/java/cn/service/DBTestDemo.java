package cn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTestDemo{

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";
    static final String USER = "root";
    static final String PASS = "rockeys1993#";

    public static void main(String args[]){

        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
        
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            Statement statement = conn.createStatement();
            
            statement.execute("USE `dbtest`");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `websites`");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("Name"));
            }
        }catch(SQLException se){
            // 处理 JDBC 错误
	    System.out.print("SQLException");
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
	    System.out.print("Exception");
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
