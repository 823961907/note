package cn.dao.util;

import java.util.Properties;

import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
//import RuntimeException;

public class DBUtil{
 
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static String driverClass = null;

    static{
	try{
	    Class clazz = DBUtil.class;

	    Properties prop = new Properties();
	    InputStream in = clazz.getResourceAsStream("/config/jdbc.properties");
	    prop.load(in);

	    url = prop.getProperty("url");
	    System.out.println(url);

	    user = prop.getProperty("user");
	    System.out.println(user);

	    password = prop.getProperty("password");
	    System.out.println(password);

	    driverClass = prop.getProperty("driverClass");
	    System.out.println(driverClass);

	    
	}catch(Exception e){
	    e.printStackTrace();
	}
    }

    public static Connection getConnection(){
	try{
	    Connection conn = DriverManager.getConnection(url, user, password);
	    return conn;
	}catch(SQLException e){
	    e.printStackTrace();
	    throw new RuntimeException(e);
	}
    }


    public static void close(Statement stmt,Connection conn){
	if(stmt != null){
	    try{
		stmt.close();
		System.out.println("statement close()");
	    }catch(SQLException e){
		e.printStackTrace();
		throw new RuntimeException(e);
	    }
	}

	if(conn != null){
	    try{
		conn.close();
		System.out.println("connection close()");
	    }catch(SQLException e){
		e.printStackTrace();
		throw new RuntimeException(e);
	    }
	}
    }

    public static void main(String args[]){
	//System.out.println(DBUtil.getConnection());
	
	Connection conn = null;
	Statement stmt = null;
	try{
	    conn = DBUtil.getConnection();
	    stmt = conn.createStatement();
	}catch(SQLException se){
	    System.out.print("SQLException");
	    se.printStackTrace();
	}catch(Exception e){
	    System.out.print("Exception");
	    e.printStackTrace();
	}finally{
	    DBUtil.close(stmt,conn);
	}
    }

}
