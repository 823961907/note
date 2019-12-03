package cn.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ActionDemo extends HttpServlet{

    public ActionDemo(){
	super();
    }

    public void init(ServletConfig config) throws ServletException{
	System.out.println("run new ActionDemo().init");
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("hello");
	System.out.println("run new ActionDemo().doGet()");
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	doGet(request,response);
    }

}
