package cn.dao.util;

import java.util.Properties;

import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.ResultSet;
//import RuntimeException;

public class DBUtil{
 
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static String driverClass = null;

    static{
	try{
	    System.out.println("DBUtil init jdbc.properties");
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

	    System.out.println("DBUtil init complete");

	    
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
    static {
	try {
	    // 将加载驱动操作，放置在静态代码块中.这样就保证了只加载一次.
	    Class.forName(driverClass);
	} catch (ClassNotFoundException e) {
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


    public static void close(ResultSet rs,Statement stmt,Connection conn){
	if(rs != null){
	    try{
		rs.close();
		System.out.println("resultSet close()");
	    }catch(SQLException e){
		e.printStackTrace();
		throw new RuntimeException(e);
	    }
	}

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
	    //DBUtil.close(stmt,conn);
	}
    }

}
