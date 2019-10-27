<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
	<title>regist page</title>
	<link rel="stylesheet" type="text/css" href="../css/regist.css">
    </head>
    <body>
	<form action="../RegistServlet" method="post">
	    <table name="registTableName" id="registTableId" class="registTableClass">
		<tr >
		    <td colspan="2" class="td1Class">regist</td>
		</tr>
		<tr>
		    <td >用户名</td>
		    <td><input type="text" name="username" id="id1"/>
			<span id="erro"></span>
		    </td>
		</tr>

		<tr>
		    <td>密码</td>
		    <td><input type="password" name="password" id="id2"/></td>
		</tr>
		<tr>
		    <td>确认密码</td>
		    <td><input type="password" name="repassword" id="id3"/></td>
		</tr>
		<tr>
		    <td>密码提示</td>
		    <td><input type="text" name="passwdTip" id="id4"/></td>
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
    <script type="text/javascript" src="../js/jquery-3.4.1.min.js" ></script>
    <script type="text/javascript"> 

    /*
	document.getElementById("registButtonId").onclick = function(){
	    //alert("test ok");
	    window.location.href="http://127.0.0.1:8080/regist.jsp";
	}
    */
    </script> 

    <script type="text/javascript" src="../js/regist.js"> 
    </script>

</html>
