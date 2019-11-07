package cn.dao.impl;

import cn.dao.UserDao;
import cn.bean.BaseUser;
import cn.dao.util.DBUtil;
import cn.dao.util.HibernateUtil;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Query;

import org.apache.log4j.Logger;

public class UserDaoImpl implements UserDao{

    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    public int registUser(BaseUser baseUser){
	System.out.println("regist method run ...");
	//get conn
	//get statement
	//exeinster
	//close()
	
	// hibernate :
	// TODO Auto-generated method stub
	logger.debug("start get hibernate ...");
        Session session = HibernateUtil.currentSession();
        Transaction tx=session.beginTransaction();
	logger.debug("got hibernate session & session.beginTransaction...");
        
        try {
	    logger.debug("hibernate to save javabean...");
            session.save(baseUser);
            tx.commit();
	    logger.debug("hibernate commit ...");
            session.close();
	    logger.debug("hibernate session close...");
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }

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
