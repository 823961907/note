<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
	<title>regist page</title>
	<link rel="stylesheet" type="text/css" href="css/login.css">
    </head>
    <body>
	<form action="RegistServlet" method="post">
	    <table name="lrTable" id="lrTableId" class="lrTableClass">
		<tr >
		    <td colspan="2" class="td1Class">regist</td>
		</tr>
		<tr>
		    <td >用户名</td>
		    <td><input type="text" name="username"/></td>
		</tr>

		<tr>
		    <td>密码</td>
		    <td><input type="password" name="password"/></td>
		</tr>
		<tr>
		    <td>确认密码</td>
		    <td><input type="password" name="repassword"/></td>
		</tr>
		<tr>
		    <td>密码提示</td>
		    <td><input type="text" name="passwdTip"/></td>
		</tr>

		<tr>
		    <td colspan="2"><input type="submit" value="regist"/>jsp+servlet</td>
		</tr>
	    </table>
	</form>
	<%--
	    out.println("hello jsp");
	--%>
    </body>

<script type="text/javascript"> 

/*
    document.getElementById("registButtonId").onclick = function(){
	//alert("test ok");
	window.location.href="http://127.0.0.1:8080/regist.jsp";
    }
*/
</script> 
</html>
