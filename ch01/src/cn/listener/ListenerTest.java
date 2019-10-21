package cn.listener;

import javax.servlet.ServletRequestListener;
import javax.servlet.ServletRequestEvent;

public class ListenerTest implements ServletRequestListener{

    public void requestDestroyed(ServletRequestEvent arg0){
	System.out.println("MyServletRequestListener Destory");
    }

    public void requestInitialized(ServletRequestEvent arg0){
	System.out.println("MyServletRequestListener Init");

	String serverName=arg0.getServletRequest().getServerName();
	System.out.println("serverName:"+serverName);
    }

}
