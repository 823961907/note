package cn.bean.test;

import cn.bean.BaseUser;

public class BaseUserTest{
    public static void main(String args[]){
	/*
	*/
	BaseUser obj = new BaseUser();

	obj.setUserName("testName1");
	obj.setPassword("testPassword1");
	obj.setRePassword("testRePassword1");
	obj.setPasswordTip("testPasswordTip1");

	System.out.println(obj.getUserName());
	System.out.println(obj.getPassword());
	System.out.println(obj.getRePassword());
	System.out.println(obj.getPasswordTip());
    }
}
