<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/12
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.jason.lee.Student" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Student student = new Student("lee", 18);
    request.setAttribute("student", student);
%>
<%--jstl替代jsp脚本--%>
<c:set target="${student}" property="name" value="jason"></c:set>
<c:set target="${student}" property="age" value="16"></c:set>

jsp: <%=request.getAttribute("student")%>
<br>
<%--el替代jsp表达式--%>
el: ${student}
<br>
jstl：<c:out value="${requestScope.student}" default="" escapeXml="true"></c:out>


</body>
</html>