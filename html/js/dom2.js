
document.getElementById("selectAll").onclick = function(){
    //alert("test ok !");
    //alert(this.checked);

    var flag = this.checked;   
    if(flag == true){
	changeAll(true);
    }else{
	changeAll(false);
    }
}

function changeAll(boolean_var){
    var boxs = document.getElementsByName("box");
    //alert(boxs.length);
    for(var i = 0 ; i < boxs.length ; i++){
	boxs[i].checked = boolean_var;
    }
}
