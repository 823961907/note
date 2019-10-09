//alert("testok");

function form_submit(){
    //alert("testok");
    var username_boolean = username_check();
    var password_boolean = password_check();
    var email_boolean = email_check();
    //alert(username_boolean);
    if(username_boolean && password_boolean && email_boolean){
	return true;
    }else{
	return false;
    }
}

function username_focus(){
    var username_span = document.getElementById("username_span");
    username_span.innerHTML = "focus ing!";
}

function username_check(){
    var username = document.getElementById("username_id").value;
    if(username == "" || username.length == 0){
	var username_span = document.getElementById("username_span");
	username_span.innerHTML = "用户名不能为空";
	return false;
    }else{
	return true;
    }
}

function password_check(){

    var password = document.getElementById("password_id").value;
    password_quanju = password;
    if(password == "" || password.length < 6){
	var password_span = document.getElementById("password_span");
	password_span.innerHTML = "不能为空，或不能小于6为";
	return false;
    }

    var repassword = document.getElementById("repassword_id").value;
    if(password != repassword){
	var repassword_span = document.getElementById("repassword_span");
	repassword_span.innerHTML = "两次密码不一致";
	return false;
    }

}

function email_check(){
    var email = document.getElementById("email_id").value;
    if(!/^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/.test(email)){
	var email_span = document.getElementById("email_span");
	email_span.innerHTML = "email格式不正确";
	return false;
    }
}

//取值Demo
function jsSubmit(){
    //alert("testok");
    var form = document.getElementById("formId");
    //另一种方法
    var form2 = document.formName; 
    //测试使用document."name"."name"取值
    var nameValue = document.formName.username_name.value;
    //alert(form2);
    //alert(nameValue);
    //设置form的属性
    //form.action = "success.html";//如果html中没有定义form的属性可以通过这种方式定义
    //form.method = "post";
    form.submit();
}

