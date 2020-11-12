<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/11
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%--声明--%>
<%! int i = 1; %>

<%--脚本片段--%>
<%
    int i = 1;
%>

<%--指令--%>
<%--静态包含--%>
<%@include file="error.jsp" %>

<%--表达式--%>
这是<%=i%>个JSP页面！

<%--动作标签--%>
<%--1、转发--%>
<jsp:forward page="file.jsp">
    <jsp:param name="from" value="index"/>
</jsp:forward>

<%--2、动态包含--%>
<jsp:include page="file.jsp"></jsp:include>


</body>
</html>
