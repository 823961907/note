package cn.bean.test;

import cn.bean.BaseUser;

public class BaseUserTest{

    public static void main(String args[]){
	/*
	*/
	BaseUser obj = new BaseUser();
	BaseUser obj1 = new BaseUser("n1","p1","p1","tip1");

	obj.setUserName("testName1");
	obj.setPassword("testPassword1");
	obj.setRePassword("testRePassword1");
	obj.setPasswordTip("testPasswordTip1");

	System.out.println(obj.getUserName());
	System.out.println(obj.getPassword());
	System.out.println(obj.getRePassword());
	System.out.println(obj.getPasswordTip());

	System.out.println(obj1.getUserName());
	System.out.println(obj1.getPassword());
	System.out.println(obj1.getRePassword());
	System.out.println(obj1.getPasswordTip());
    }
}
