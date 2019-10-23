package cn.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bean.BaseUser;


public class RegistServlet extends HttpServlet{

    public RegistServlet(){
	super();
    }

    public void init(ServletConfig config) throws ServletException{
	System.out.println("run new RegistServlet().init");
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

	String username = request.getParameter("username");
	System.out.println("regist.jsp : username =" + username);
	String password = request.getParameter("password");
	System.out.println("regist.jsp : password =" + password);
	String repassword = request.getParameter("repassword");
	System.out.println("regist.jsp : repassword =" + repassword);
	String passwdTip = request.getParameter("passwdTip");
	System.out.println("regist.jsp : passwdTip =" + passwdTip);
	
	/*
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("hello");
	*/

	response.getWriter().write("{\"res\":1}");
	System.out.println("run new RegistServlet().doGet()");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	System.out.println("run new RegistServlet().doPost()");
	doGet(request,response);
    }

}
