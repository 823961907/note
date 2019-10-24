package cn.dao.impl;

import cn.dao.UserDao;
import cn.bean.BaseUser;

import java.util.List;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao{

    public void registUser(BaseUser baseUser){
	//System.out.println("regist method run ...");
    }

    public List<BaseUser> getAllUser(){
	List<BaseUser> list = new ArrayList<BaseUser>();
	return list;
    }

    public BaseUser getUserByUserName(String userName){
	BaseUser user = new BaseUser();
	return user;
    }
}
