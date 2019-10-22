package cn.bean;

import cn.bean.test.BaseUserTest;

public class BaseUser{

    private String userName;
    private String password;
    private String rePassword;
    private String passwordTip;

    public BaseUser(){}

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
