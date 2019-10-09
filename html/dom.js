//alert("test ok bu ok !");

function allRun(){
    //alert("test!!!");
    /*
    var all = document.getElementsByName("checkbox");
    alert(all.length);
    alert(typeof(all[1].getAttribute("checked")));
    for(var i = 0 ; i < all.length ; i++){
	all[i].setAttribute("checked","ture");
    }
    this.getAttribute("checked");
    */
    var t = document.getElementById("quanxuan").checked;
    //alert(t);
    if(t == true){
	selectAll();
    }else{
	noselectAll();
    }
}
/*
document.getElementById("quanxuan2").onclick = function(){
    //alert(" niminghanshu !");
    //alert(t1.nodeValue);
    var all = document.getElementsByName("checkbox");
    //alert(all.length);
    //alert(typeof(all[1].getAttribute("checked")));
    for(var i = 0 ; i < all.length ; i++){
	
	//var tag = all[i].getAttribute("checked");
	var tag = all[i].checked;
	//alert(tag);
	if(tag == true){
	    //all[i].setAttribute("checked","ture");
	    all[i].checked = false;
	}else{
	    //all[i].setAttribute("checked","false");
	    all[i].checked = true;
	}
	//alert(all[i].getAttribute("checked"));
    }
    
}
*/
function selectAll(){
    var boxs = document.getElementsByName("checkbox");
    for(var i = 0 ; i < boxs.length ; i++){
	boxs[i].checked = true;
    }
}

function noselectAll(){
    var boxs = document.getElementsByName("checkbox");
    for(var i = 0 ; i < boxs.length ; i++){
	boxs[i].removeAttribute("checked");
	boxs[i].checked = false;
    }
}

function fanxuan(){
    var boxs = document.getElementsByName("checkbox");
    for(var i = 0 ; i < boxs.length ; i++){
	if(boxs[i].checked == true){
	    boxs[i].checked = false;
	}else{
	    boxs[i].checked = true;
	}
    }
}
