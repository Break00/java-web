<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/12
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% application.setAttribute("name", "lee");%>
<% session.setAttribute("name", "lee");%>
<% request.setAttribute("name", "lee");%>
<% pageContext.setAttribute("name", "lee");%>

application:<%=application.getAttribute("name")%>
session:<%=session.getAttribute("name")%>
request:<%=request.getAttribute("name")%>
pageContext:<%=pageContext.getAttribute("name")%>

<%--<jsp:forward page="file.jsp"></jsp:forward>--%>
<a href="file.jsp">超链接</a>

</body>
</html>
