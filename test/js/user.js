function run1(){
    var windows = window.opener;
    alert(windows.document.getElementById("username").value);
}
function run2(){
    //alert('testok,run');
    var windows = window.opener;
    windows.document.getElementById("textId1").value='zhaosi';
    windows.document.getElementById("textId2").value='002';
}
function run3(){
    //alert('testok,run');
    var windows = window.opener;
    windows.document.getElementById("textId1").value='wangwu';
    windows.document.getElementById("textId2").value='003';
}
