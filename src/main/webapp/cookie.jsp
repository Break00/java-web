<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/11
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="CookieServlet">测试Cookie</a>
<br>
<!--表单-->
<form action="CookieServlet" target="_self" method="post">
    用户名：<input value="${cookie.name.value}" type="text" name="name" id="userName"><br>
    密&emsp;码：<input value="${cookie.password.value}" type="password" name="password"><br>
    <br>
    记住密码：<input type="checkbox" name="rememberMe" value="rememberMe">
    <br>
    <input type="reset">
    <input id="submitBtn" type="submit" value="登录">
</form>
</body>
</html>
