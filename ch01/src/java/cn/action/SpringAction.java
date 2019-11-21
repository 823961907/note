package cn.action;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.dao.SpringDaoDemo1;


public class SpringAction{

    public static void main(){
	//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");

	SpringDaoDemo1 helloService = (SpringDaoDemo1)applicationContext.getBean("helloService");

	helloService.sayHello();
	
    }
}
