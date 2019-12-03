package cn.dao.util;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class PropertiesTest{

    public static void main(String args[]){
	Class clazz = PropertiesTest.class;
	Properties prop = new Properties();
	// 根路径，是package 的上一级路径的平行位置
	// src/java src/config src/java/cn/dao.util.PropertiesTest.java src/config/jdbc.properties
	// tomcat 中，跟目录是WEB-INF/classes,所以WEB-INF/classes/config/jdbc.properties
	InputStream in = clazz.getResourceAsStream("/config/jdbc.properties");
	
	try{
	    prop.load(in);
	}catch(IOException ioe){
	    ioe.printStackTrace();
	}finally{
	    System.out.println("properties load file complete");
	}

	String url = prop.getProperty("url");
	System.out.println(url);
    }

}
