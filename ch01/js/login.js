//alert("test");

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

    xmlHttp.open("GET","../jsp/loginError.html",true);
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
}
