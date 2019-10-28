//alert("test");
function isEmpty(value){
    if(value == null || value == "" || value == "undefined" || value == undefined || value == "null"){
        return true;
    }
    else{
        value = value.replace(/\s/g,"");
        if(value == ""){
            return true;
        }
        return false;
    }
} 
document.getElementById("ajaxTest").onclick = function(){
//document.getElementById("loginSubmit").onclick = function(){
    console.log("test check");
    //alert("start check username & password");

    var xmlHttp;
    if(window.XMLHttpRequest){
	xmlHttp = new XMLHttpRequest();
	console.log("got xmlhttp obj");
    }else{
	xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	console.log("got xmlhttp obj1");
    }

    //xmlHttp.open("GET","../jsp/loginError.html",true);
    xmlHttp.open("POST","../jsp/loginError.html",true);
    
    console.log("open method");

    xmlHttp.onreadystatechange = function(){
	console.log(xmlHttp.readState);
	console.log(xmlHttp.status);
	if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
	    document.getElementById("myDiv").innerHTML = xmlHttp.responseText;
	}
    }


    //xmlHttp.open("GET","../jsp/loginError.html",true);
    xmlHttp.send();
    console.log("send method");
    return false;
}

document.getElementById("loginSubmit").onclick = function(){
    console.log("test check");
    //alert("start check username & password");

    var username =document.getElementById("loginUsername").value; 
    var password =document.getElementById("loginPassword").value; 
    console.log(username + " & " + password);
    var b1 = isEmpty(username);
    var b2 = isEmpty(password);
    console.log(b1 +" & "+ b2);

    if(b1 || b2){
	//ajax
	var xmlHttp;
	if(window.XMLHttpRequest){
	    xmlHttp = new XMLHttpRequest();
	    console.log("got xmlhttp obj");
	}else{
	xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	console.log("got xmlhttp obj1");
	}

	//xmlHttp.open("GET","../jsp/loginError.html",true);
	xmlHttp.open("POST","../jsp/loginError.html",true);
	console.log("ajax xmlHttp open method");

	xmlHttp.onreadystatechange = function(){
	    console.log(xmlHttp.readState);
	    console.log(xmlHttp.status);
	    if(xmlHttp.readyState == 4 && xmlHttp.status == 200){
		console.log(xmlHttp.responseText);
		document.getElementById("myDiv").innerHTML = xmlHttp.responseText;
	    }
	}


	//xmlHttp.open("GET","../jsp/loginError.html",true);
	xmlHttp.send();
	console.log("ajax xmlHttp send method");
	//ajax 显示完成
	return false;
    }else{
	return true;
    }
}

