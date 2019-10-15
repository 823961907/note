package cn.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{

    public LoginServlet(){
	super();
    }

    public void init(ServletConfig config) throws ServletException{
	System.out.println("run new LoginServlet().init");
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	//request
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String username1 = username.trim();
	String password1 = password.trim();
	

	if(username1.equals("") || password1.equals("")){
	    System.out.println("用户名或者密码为空" );
	}
	System.out.println("username = " + username);
	System.out.println("password = " + password);
	

	//response
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("hello");
	System.out.println("run new LoginServlet().doGet()");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	doGet(request,response);
    }

}
