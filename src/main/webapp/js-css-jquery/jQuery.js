alert($);
// $ 代替jQuery对象
// 1、传入参数为【函数】，在文档加载完成时执行该函数   $(function(){}) == window.onload=function(){}
// 2、传入参数为【选择器字符串】，根据该字符串查找元素节点
// 3、传入参数为【HTML字符串】，根据字符串创建元素节点
// 4、传入参数为【DOM标签】，将DOM对象包装为jQuery对象返回

// $(function(){}) == window.onload=function(){}
// window.onload 只能触发一次
// $(function(){})可触发多次

// [1]
$(function () {
    // [2]
    $("#btn").click(function () {
        alert("click");
    });
    // [3]
    var $li = $("<li>HF</li>");
    $("ul").append($li);
    // [4]
    var aq = document.getElementById("aq");
    alert(aq);
    alert($("aq"))
});

$(function () {
    $("#dom2dom").click(function () {
        //使用DOM对象调用DOM方法
        var div = document.getElementById("testDiv");
        alert(div.innerText);
    });

    $("#dom2jQuery").click(function () {
        //使用DOM对象调用jQuery方法
        var div = document.getElementById("testDiv");
        // 将DOM对象转换为jQuery对象
        var $div = $(div);
        alert($div.text());
    });

    $("#jQuery2jQuery").click(function () {
        //使用jQuery对象调用jQuery方法
        var $div = $("#testDiv");
        alert($div.text());
    });

    $("#jQuery2dom").click(function () {
        //使用jQuery对象调用jQuery方法
        var $div = $("#testDiv");
        // 将jQuery对象转换为DOM对象
        var div = $div[0]; // $div.get(0)
        alert(div.innerText);
    });
})