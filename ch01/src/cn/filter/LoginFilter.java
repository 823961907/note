package cn.filter;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;


public class LoginFilter implements Filter{

    public void init(FilterConfig config) throws ServletException{
	//从xml中获取数据

	String site = config.getInitParameter("Site");
	System.out.println("site = " + site);
    }

    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws java.io.IOException,ServletException{

	System.out.println(" LoginFilter.class doFilter method runed");

	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String username1 = username.trim();
	String password1 = password.trim();

	if(username1.equals("") || password1.equals("")){
	    /* 因为没有 chain.doFilter(request,response);所以request被拦截，javascript中也有校验所以这里的out 语句没有执行。*/
	    System.out.println("用户名或者密码为空" );	
	}else{
	    System.out.println("username = " + username);
	    System.out.println("password = " + password);
	    // 把请求传回过滤链,servlet也在属于过滤链。该拦截器不拦截此请求和响应。
	    chain.doFilter(request,response);
	}
    }

    public void destroy(){
	/*  在该实例被web容器从服务移除之前调用 */
	System.out.println(" LoginFilter.class destory method runed");
    }
}
