package cn.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
//提供一种方法来跨多个页面请求或访问Web站点来标识用户，并存储有关该用户的信息。
import javax.servlet.http.HttpSession;




public class LoginServlet extends HttpServlet{

    public LoginServlet(){
	super();
    }

    public void init(ServletConfig config) throws ServletException{
	System.out.println("run new LoginServlet().init");
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	//request
	/*
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String username1 = username.trim();
	String password1 = password.trim();
	

	if(username1.equals("") || password1.equals("")){
	    System.out.println("用户名或者密码为空" );
	}else{
	    System.out.println("username = " + username);
	    System.out.println("password = " + password);

	}
	*/
	//cookies
	Cookie cookie = null;
	Cookie[] cookies = null;
	// 获取获取HTTP头中的 Cookie 的数组
	cookies = request.getCookies();
	System.out.println("cookies array length= " + cookies.length);
	if( cookies != null ){
	    System.out.println("cookie is not null");
	    for(int i = 0 ; i < cookies.length ; i++){
		String cookieName = cookies[i].getName();
		System.out.println("cookieName = " + cookieName);

		int maxAge = cookies[i].getMaxAge();
		System.out.println("maxAge = " + maxAge);

		String value = cookies[i].getValue();
		System.out.println("value = " + value);

		//System.out.println("");
	    }
	}else{
	    System.out.println("No Cookie founds");
	}

	//session
	//HttpSession session = request.getSession();
	HttpSession session = request.getSession(true);//如果没有session似乎会创建一个session
	Date createTime = new Date(session.getCreationTime());
	//设置日期输出的格式所需要用到的实例
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String timeStr = df.format(createTime);//这里用的是SimpleDateFormat的父类的方法
	System.out.println("session create time : " + timeStr);
	

	//response
	/*
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("hello");
	System.out.println("run new LoginServlet().doGet()");
	*/
	response.sendRedirect("jsp/index.jsp");
	System.out.println("run new LoginServlet().doGet()");

    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	doGet(request,response);
    }

}
