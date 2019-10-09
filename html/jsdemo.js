/*alert("hello wolrd");

function getSum(){
    return 100;
}

var sum = getSum;
alert(sum);//输出内容是3-5行

var sum2 = sum();
alert(sum2);//输出内容是100
*/

//javascript的对象：
//String
//声明
var str = "abc";
var str = new String("abc");
//属性
//alert(str.length);
//方法
//https://www.w3school.com.cn/jsref/index.asp
//和HTML相关的方法
//和java的String类似
//

//alert("testok");

function mytrim(str){
    var start = 0;
    var end = str.length-1;
    while(start <= end && str.charAt(start) == " "){
	start++;
    }
    while(start <= end && str.charAt(end) == " "){
	end--;
    }
    var result = str.substring(start,end+1);
    return result;
}


//alert("-"+mytrim("       bad k      ")+"-");
window.document.write(mytrim("     bcck kkk  "));
window.document.write(new Date());

function run(){
    //window.document.write("<br/>"+new Date());
    alert(new Date());
}
