<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/12
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.jason.lee.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% application.setAttribute("name", "lee");%>
<% session.setAttribute("name", "is");%>
<% request.setAttribute("name", "no");%>
<% pageContext.setAttribute("name", "one");%>

el表达式获取application域对象中值：${applicationScope.name}
<br>
el表达式获取session域对象中值：${sessionScope.name}
<br>
el表达式获取request域对象中值：${requestScope.name}
<br>
el表达式获取pageContext域对象中值：${pageScope.name}
<br>
<%
    Student student = new Student("lee", 18);
    request.setAttribute("student", student);
%>
el: ${student}
<br>
jsp: <%=request.getAttribute("student")%>

</body>
</html>
