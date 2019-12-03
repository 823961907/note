package com.mybatis.po;
/**
* springtest数据库中user表的持久类
*/
public class MyUser {
    private Integer uid; // 主键
    private String uname;
    private String usex;
    // 此处省略setter和getter方法

    public void setUname(String uname){
	this.uname = uname;
    }

    public void setUid(Integer uid){
	this.uid = uid;
    }

    public Integer getUid(){
	return this.uid;
    }

    public void setUsex(String usex){
	this.usex = usex;
    }

    public String getUname(){
	return this.uname;
    }

    public String getUsex(){
	return this.usex;
    }

    @Override
    public String toString() { // 为了方便查看结果，重写了toString方法
	return "User[uid=" + uid + ",uname=" + uname + ",usex=" + usex + "]";
    }
}
