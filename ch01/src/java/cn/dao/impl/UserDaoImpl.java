package cn.dao.impl;

import cn.dao.UserDao;
import cn.bean.BaseUser;
import cn.dao.util.DBUtil;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{

    public int registUser(BaseUser baseUser){
	System.out.println("regist method run ...");
	//get conn
	//get statement
	//exeinster
	//close()

	return 1;
	
    }

    public List<BaseUser> getAllUser(){

	List<BaseUser> list = new ArrayList<BaseUser>();

	Connection conn = null;
	Statement stmt = null;
	ResultSet resultSet = null;

	String sql = "SELECT * FROM base_user";
	try{
	    conn = DBUtil.getConnection();
	    stmt = conn.createStatement();
	    //stmt.execute("USE dbtest");
	    resultSet = stmt.executeQuery(sql);
	    System.out.println(sql);

	    while(resultSet.next()) {
		String username = resultSet.getString("username");
		String password = resultSet.getString("password");
		String repassword = resultSet.getString("repassword");
		String passwdTip = resultSet.getString("passwordTip");

		System.out.println(username);
		System.out.println(password);
		System.out.println(repassword);
		System.out.println(passwdTip);

		BaseUser registBean = new BaseUser();
		registBean.setUserName(username);
		registBean.setPassword(password);
		registBean.setRePassword(repassword);
		registBean.setPasswordTip(passwdTip);

		list.add(registBean);
	    }

	}catch(SQLException se){
	    se.printStackTrace();
	    throw new RuntimeException(se);

	}finally{
	    DBUtil.close(resultSet,stmt,conn);
	}

	return list;
    }

    public BaseUser getUserByUserName(String userName){
	BaseUser user = null;
	Connection conn = null;
	Statement stmt = null;
	ResultSet resultSet = null;

	String sql = "SELECT * FROM base_user where username = \"" + userName +"\"";
	System.out.println(sql);
	try{
	    conn = DBUtil.getConnection();
	    stmt = conn.createStatement();
	    resultSet = stmt.executeQuery(sql);
	    System.out.println("execute sql complete");

	    while(resultSet.next()){
		String username = resultSet.getString("username");
		String password = resultSet.getString("password");
		String repassword = resultSet.getString("repassword");
		String passwdTip = resultSet.getString("passwordTip");

		System.out.println(username);
		System.out.println(password);
		System.out.println(repassword);
		System.out.println(passwdTip);

		user = new BaseUser();
		user.setUserName(username);
		user.setPassword(password);
		user.setRePassword(repassword);
		user.setPasswordTip(passwdTip);
	    }
	    
	}catch(SQLException se){
	    se.printStackTrace();
	    throw new RuntimeException(se);

	}finally{
	    DBUtil.close(resultSet,stmt,conn);
	}
	return user;
    }
}
