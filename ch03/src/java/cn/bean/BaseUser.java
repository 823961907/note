package cn.bean;

import cn.bean.test.BaseUserTest;

public class BaseUser{

    private int id;
    private String userName;
    private String password;
    private String rePassword;
    private String passwordTip;

    public BaseUser(){}

    public BaseUser(int id,String userName,String password,String rePassword,String passwordTip){
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.rePassword = rePassword;
	this.passwordTip = passwordTip;
    }

    public void setId(int id){
	this.id = id;
    }

    public void setUserName(String userName){
	this.userName = userName;
    }

    public void setPassword(String password){
	this.password = password;
    }

    public void setRePassword(String rePassword){
	this.rePassword = rePassword;
    }

    public void setPasswordTip(String passwordTip){
	this.passwordTip = passwordTip;
    }


    public int getId(){
	return id;
    }

    public String getUserName(){
	return userName;
    }

    public String getPassword(){
	return password;
    }

    public String getRePassword(){
	return rePassword;
    }

    public String getPasswordTip(){
	return passwordTip;
    }

}
