//jQuery:   $(function(){});
//$("").action();

$(function(){

    console.log("hello jquery");

    $("#id1").blur(function(){
	console.log("username input blur event run()");
	//$.ajax({ ... ... });
	$.ajax({
	    type:"post",
	    //url:"${pageContext.request.contextPath}/RegistServlet",
	    url:"../RegistServlet",
	    async:"true",
	    data:{
		"username":$("#id1").val()
	    },
	    dataType:"json",

	    success:function(data){

		console.log(data);
		console.log("success code");

		console.log(data.res);
		if(data.res == 1){
		    $("#erro").text("该用户已存在");
		    console.log("modify div complete");
		}else{
		    $("#erro").text("该用户可用");
		    console.log("modify div complete");
		}

	    }
	})
    });

});
