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
	//System.out.println("regist method run ...");
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

	try{
	    conn = DBUtil.getConnection();
	    stmt = conn.createStatement();

	    stmt.execute("USE dbtest");
	    ResultSet resultSet = stmt.executeQuery("SELECT * FROM base_user");

	    while(resultSet.next()) {
		String username = resultSet.getString("username");
		String password = resultSet.getString("password");
		String repassword = resultSet.getString("repassword");
		String passwdTip = resultSet.getString("passwdTip");

		System.out.println(resultSet.getString("username"));
		System.out.println(resultSet.getString("password"));
		System.out.println(resultSet.getString("repassword"));
		System.out.println(resultSet.getString("passwdTip"));

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
	    DBUtil.close(stmt,conn);
	}

	return list;
    }

    public BaseUser getUserByUserName(String userName){
	BaseUser user = new BaseUser();
	return user;
    }
}
