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

sessionId: <%=session.getId()%>
<br>
<a href="SessionServlet">测试Session</a>

<!--表单-->
<form action="TestServlet" target="_self" method="post">
    用户名：<input type="text" name="name" id="userName"><br>
    密&emsp;码：<input type="password" name="password"><br>
    <input type="hidden" name="uuid" value="">
    <br>
    <input type="reset">
    <input id="submitBtn" type="submit" value="登录">
</form>


</body>
</html>
