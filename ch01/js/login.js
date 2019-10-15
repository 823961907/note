//alert("test");

document.getElementById("loginSubmit").onclick = function(){
    alert("start check username & password");

    var xmlHttp;
    if(window.XMLHttpRequest){
	xmlHttp = new XMLHttpRequest();
    }else{
	xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadstatechange = function(){
	if(xmlhttp.readState == 4

    }
}
