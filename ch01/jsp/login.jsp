<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
	<title>first jsp page</title>
	<link rel="stylesheet" type="text/css" href="../css/login.css">
    </head>
    <body>
	<form action="../LoginServlet" method="post">
	    <table name="lrTable" id="lrTableId" class="lrTableClass">
		<tr >
		    <td colspan="2" class="td1Class">用户登录</td>
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
		    <td colspan="2">
			<div id="myDiv">ajax 登录信息</div>
			<input type="submit" value="login" id="loginSubmit"/>
			<input type="button" id="registButtonId" value="regist"/>
			<input type="button" id="ajaxTest" value="ajax"/>
		    </td>
		</tr>
	    </table>
	</form>
	<%--
	    out.println("hello jsp");
	--%>
    </body>

<script type="text/javascript"> 

    //跳转注册页面
    document.getElementById("registButtonId").onclick = function(){
	alert("test ok");
	window.location.href="http://127.0.0.1:8080/hello/jsp/regist.jsp";
    }
    document.getElementById("loginSubmit").onclick = function(){
	//alert("test test");
	console.log("text");
    }
</script> 
<script type="text/javascript" src="../js/login.js"> 
</script> 

</html>
