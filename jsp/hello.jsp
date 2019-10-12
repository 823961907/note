<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
	<title>first jsp page</title>
	<link rel="stylesheet" type="text/css" href="css/login.css">
    </head>
    <body>
	<form action="HelloWorld" method="get">
	    <table border="1px" align="center" name="loginTable" id="loginTableId" class="loginClass">
		<tr >
		    <td colspan="2" class="tableNameClass">用户登录</td>
		</tr>
		<tr>
		    <td >用户名</td>
		    <td><input type="text" name="username"/></td>
		</tr>
		<tr>
		    <td>密码</td>
		    <td><input type="password"/></td>
		</tr>
		<tr>
		    <td colspan="2"><input type="submit" value="login"/>jsp+servlet</td>
		</tr>
	    </table>
	</form>
	<%--
	    out.println("hello jsp");
	--%>
    </body>
</html>
