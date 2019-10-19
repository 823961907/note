//alert("test");

document.getElementById("myDiv").onclick = function(){
//document.getElementById("loginSubmit").onclick = function(){
    console.log("test check");
    //alert("start check username & password");

    var xmlHttp;
    if(window.XMLHttpRequest){
	xmlHttp = new XMLHttpRequest();
    }else{
	xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlHttp.onreadstatechange = function(){
	if(xmlHttp.readState == 4 && xmlHttp.status == 200){
	    document.getElementById("myDiv").innerHTML = xmlHttp.responseText;
	}
    }

    xmlHttp.open("GET","loginError.html",true);
    //xmlHttp.open("GET","../jsp/loginError.html",true);
    xmlHttp.send();
}
