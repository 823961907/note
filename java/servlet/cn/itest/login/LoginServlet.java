
package cn.itest.login;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class LoginServlet extends HttpServlet{

    public LoginServlet(){
	super();
    }   

    public void init(ServletConfig config) throws ServletException{
	System.out.println("run init()!");
    }

    public void destory(){}
    /*
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	System.out.println("run service() !");
	doGet(request,response);
    }
    */

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	//response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	String username = request.getParameter("username");
	String password = request.getParameter("password");

	System.out.println(username);
	System.out.println(password);

	PrintWriter out = response.getWriter();
	out.println("<h1>" + username + "</h1>");
	out.println("<h1>" + password + "</h1>");
	out.println("<h1>" + "hello test "+ "</h1>");
    
	/*
	response.setContentType("text/html");
	String name = request.getParameter("username");
	PrintWriter out = response.getWriter();
	out.println("<h1>" + name + "</h1>");
	*/
	
	/*
	PrintWriter out = response.getWriter();
	out.println("<h1> hello test </h1>");
	*/

    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	doGet(request, response);
    }

}
